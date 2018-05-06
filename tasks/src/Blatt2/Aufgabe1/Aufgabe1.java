package Blatt2.Aufgabe1;

public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println("Fakultät von " + args[0] + " ist: " + fakultät(Long.parseLong(args[0])));
        System.out.println("Binominal Koeffizent von " + args[0] + " und " + args[1] + "ist: " + bionom(Long.parseLong(args[0]), Long.parseLong(args[1])));
        System.out.println("Lotto Zeug von " + args[0] + " und " + args[1] + "ist: " + lotto(Long.parseLong(args[0]), Long.parseLong(args[1])));

    }

    private static long lotto(long n, long k) {
        return fakultät(k) * bionom(n, k);
    }

    private static long bionom(long n, long k) {
        if (n <= 0 && n < k) {
            return 0;
        }
        long zähler = 1;
        long nenner = 1;
        for (long i = n; i > n - k; i--) {
            zähler *= i;
        }
        for (int i = 1; i <= k; i++) {
            nenner *= i;
        }
        return zähler / nenner;
    }

    private static long fakultät(long n) {
        if (n == 1) {
            return 1;
        }
        return n * fakultät(n - 1);
    }


}
