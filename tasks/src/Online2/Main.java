package Online2;

public class Main {
    public static void main(String[] args) {
        Zahlen[] zahlenArray = new Zahlen[2];
        zahlenArray[0] = new GeoReihe();
        zahlenArray[1] = new Fibonacci();
        for (Zahlen zahlen : zahlenArray) {
            zahlen.print();
        }
    }
}
