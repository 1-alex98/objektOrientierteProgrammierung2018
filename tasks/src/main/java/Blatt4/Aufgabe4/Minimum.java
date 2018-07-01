package Blatt4.Aufgabe4;

import java.util.Arrays;

public class Minimum {
    public static Comparable findMin(Comparable[] x) {
        return Arrays.stream(x).min((o1, o2) -> o1.compareTo(o2)).orElse(null);
    }
}
