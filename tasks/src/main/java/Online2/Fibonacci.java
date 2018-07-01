package Online2;

public class Fibonacci extends Thread implements Zahlen {
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 40; i++) {
            System.out.println(String.format("Fibonacci zahl n=%d ist %d", i, fib(i)));
            if (i > 1) {
                System.out.println(String.format("Goldene Zahl approx. für n=%d ist %f", i, ((double) fib(i)) / fib(i - 1)));
            }
        }
    }

    private int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    @Override
    public void print() {
        start();
    }
}
