package Blatt2.Aufgabe2;

public class Aufgabe2 {
    public static void main(String[] args) {
        test64();
        test65();
    }

    private static void test65() {
        if (6.5d == 6.5f) {
            System.out.println("6.5==6.5f");
        } else {
            System.out.println("6.5!=6.5f");
        }
    }

    private static void test64() {
        if (6.4d == 6.4f) {
            System.out.println("6.4==6.4f");
        } else {
            System.out.println("6.4!=6.4f");
        }
    }
}
//6.4 is a double and 6.4f is a float none of the two can actually be 6.4 it will be something like 3.399999, but as they are of different accuracy they are not the same number!!!