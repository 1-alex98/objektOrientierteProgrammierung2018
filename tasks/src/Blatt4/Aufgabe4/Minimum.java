package Blatt4.Aufgabe4;

public class Minimum {
    public static Comparable findMin(Comparable[] x) {
        Comparable kleinster = x[1];
        for (int i = 1; i < x.length; i++) {
            if (kleinster.compareTo(x[i]) < 0) {
                kleinster = x[i];
            }
        }
        return kleinster;
    }
}
