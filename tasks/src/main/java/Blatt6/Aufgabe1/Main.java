package Blatt6.Aufgabe1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class Main {
    // a mit angabe von this wenn die Kalsse Runnable implementiert oder einer anderen Klasse/inneren Klasse die Runnable implemntiert
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new CounterCommand());
        thread.start();
        Thread thread1 = new Thread(new DateCommand());
        thread1.start();

        int max = 1000000;
        int divide = 16;
        List<CompletableFuture<List<Integer>>> futureList = new ArrayList<>();

        long instant = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(divide);

        for (int i = 0; i < divide; i++) {
            CompletableFuture<List<Integer>> future = CompletableFuture.supplyAsync(new PrimCalcullator(0, i, divide, max), executorService);
            futureList.add(future);
        }
        CompletableFuture<List<Integer>> completedFuture = CompletableFuture.completedFuture(new ArrayList<>());
        for (CompletableFuture<List<Integer>> future : futureList) {
            completedFuture = completedFuture.thenCombineAsync(future, (list, list2) -> {
                list.addAll(list2);
                return list;
            });
        }
        completedFuture.thenAccept(x -> {
            System.out.println(System.currentTimeMillis() - instant);
            System.out.println(x);
        }).exceptionally(throwable -> {
            new Exception(throwable).printStackTrace();
            return null;
        });

    }

    static class PrimCalcullator implements Supplier<List<Integer>> {
        private final int start;
        private final int offset;
        private final int skip;
        private final int end;

        public PrimCalcullator(int start, int offset, int skip, int end) {
            this.start = start;
            this.offset = offset;
            this.skip = skip;
            this.end = end;
        }

        @Override
        public List<Integer> get() {
            List<Integer> prims = new ArrayList<>();
            for (int i = start + offset; i <= end; i += skip) {
                if (isPrim(i)) {
                    prims.add(i);
                }
            }
            return prims;
        }

        private boolean isPrim(int i) {
            for (int y = 2; y <= i / 2; y++) {
                if (i % y == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
