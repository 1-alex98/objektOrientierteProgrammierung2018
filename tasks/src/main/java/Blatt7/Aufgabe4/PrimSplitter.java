package Blatt7.Aufgabe4;

import Blatt6.Aufgabe1.Main;
import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.github.nocatch.NoCatch.noCatch;

public class PrimSplitter {
    private final int limit;
    private final ExecutorService executorService;
    private CompletableFuture<List<Integer>> prims;

    public PrimSplitter( int limit, int divide) {
        this.limit = limit;
        List<CompletableFuture<List<Integer>>> futureList = new ArrayList<>();

        executorService = Executors.newFixedThreadPool(divide);

        for (int i = 0; i < divide; i++) {
            CompletableFuture<List<Integer>> future = CompletableFuture.supplyAsync(new PrimCalculator(2, i, divide, limit), executorService);
            futureList.add(future);
        }
        CompletableFuture<List<Integer>> completedFuture = CompletableFuture.completedFuture(new ArrayList<>());
        for (CompletableFuture<List<Integer>> future : futureList) {
            completedFuture = completedFuture.thenCombineAsync(future, (list, list2) -> {
                list.addAll(list2);
                list.sort(Comparator.naturalOrder());
                return list;
            });
            //FIXME: Why can we not use the executor here???!! Why do we use the default system executor?
        }
        prims=completedFuture;
    }

    private List<Integer> split(final int x) throws ExecutionException, InterruptedException {
        List<Integer> primNumbers= prims.get();
        ArrayList<Integer> result = new ArrayList<>();
        int n=x;
        while (n > 1) {
            for (Integer prim : primNumbers) {
                if (n % prim == 0) {
                    result.add(prim);
                    n=n/prim;
                    break;
                }
            }
        }
        return result;

    }

    public Map<Integer,List<Integer>> getSplitted(int start, int end) throws ExecutionException, InterruptedException {
        Map<Integer,CompletableFuture<List<Integer>>> resultsFuture= new HashMap<>();
        for (;start<=end;start++){
            final int i=start;
            resultsFuture.put(start,CompletableFuture.supplyAsync(() -> noCatch(()->split(i)),executorService));
        }
        Map<Integer,List<Integer>> result= new HashMap<>();
        for (Map.Entry<Integer,CompletableFuture<List<Integer>>> entry:resultsFuture.entrySet()){
            result.put(entry.getKey(),entry.getValue().get());
        }
        return result;
    }

    public void shutdown(){
        executorService.shutdown();
    }
}
