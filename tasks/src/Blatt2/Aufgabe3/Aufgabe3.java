package Blatt2.Aufgabe3;

public class Aufgabe3 {
    public static void main(String[] args) {
        int a, b, z1, z2, r;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);


        if (a < b) {
            z2 = a;
            z1 = b;
        } else {
            z1 = a;
            z2 = b;
        }


        r = z1 % z2;

        while (r != 0) {
            z1 = z2;
            z2 = r;
            r = z1 % z2;

        }

        System.out.println("Der GGT von " + a + " und " + b + " ist " + z2);
    }
}
