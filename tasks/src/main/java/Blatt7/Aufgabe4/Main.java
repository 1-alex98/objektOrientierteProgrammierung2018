package Blatt7.Aufgabe4;

import static com.github.nocatch.NoCatch.noCatch;

public class Main {
    public static void main(String[] args){
        long singleTime = messureRunnable(() -> {
            PrimSplitter primSplitter = new PrimSplitter(100000, 1);
            noCatch(() -> {
                        primSplitter.getSplitted(2, 100000);
                        primSplitter.shutdown();
                    }
            );
        });
        //CPU Last ca 25%

        long hexTime = messureRunnable(() -> {
            PrimSplitter primSplitter = new PrimSplitter(100000, 8);
            noCatch(() -> {
                        primSplitter.getSplitted(2, 100000);
                        primSplitter.shutdown();
                    }
            );
        });
        //CPU Last ca 80%


        print("Single time was 100k: "+singleTime);
        print("Hex time was 100k: "+hexTime);

        singleTime = messureRunnable(() -> {
            PrimSplitter primSplitter = new PrimSplitter(1000000, 1);
            noCatch(() -> {
                        primSplitter.getSplitted(1000000, 1000010);
                        primSplitter.shutdown();
                    }
            );
        });
        //CPU Last ca 25%

        hexTime = messureRunnable(() -> {
            PrimSplitter primSplitter = new PrimSplitter(1000000, 8);
            noCatch(() -> {
                        primSplitter.getSplitted(1000000, 1000010);
                        primSplitter.shutdown();
                    }
            );
        });
        //CPU Last ca 80%

        print("Single time was 1m: "+singleTime);
        print("Hex time was 1m: "+hexTime);
        /*
            Single time was 100k: 1099
            Hex time was 100k: 405
            Single time was 1m: 49619
            Hex time was 1m: 18196
            Why is it not reaching 100% cpu load but only 80% mit 16 Threads kriege ich 100%
         */
    }

    private static synchronized void print(String msg){
        System.out.println(msg);
    }

    private static long messureRunnable(Runnable runnable){
        long start= System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis()-start;
    }
}
