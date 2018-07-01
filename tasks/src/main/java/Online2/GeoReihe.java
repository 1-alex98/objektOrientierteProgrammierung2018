package Online2;

public class GeoReihe implements Zahlen, Runnable {
    @Override
    public void print() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 40; i++) {
            System.out.println(String.format("Geo Zahl für n=%d ist %f", i, geo(i)));
            System.out.println(String.format("Geo Sum Zahl für n=%d ist" + geoSum(i), i));
        }
    }

    private double geoSum(int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += geo(i);
        }
        return sum;
    }

    private double geo(int n) {
        return Math.pow(0.5, n);
    }
}
