package Blatt1.Blatt.Aufgabe3;

public class Aufgabe3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");
        int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
        System.out.println(++k); // Ausgabe a)
        System.out.println(k); // Ausgabe b)
        System.out.println(k++); // Ausgabe c)
        int k2 = 5;
        double result = k2 / 2.0; // Stelle 1
        System.out.println("5 / 2 = " + result); // Ausgabe d)
        boolean b = false;
        System.out.println(String.format("b ist %s.", b ? "wahr" : "falsch")); // Ausgabe e)
    }
}
/**
 * Teil a: Ja erste ist pre increment also wird der Wert vorher inkrementiert also ist es 3 und mein letzten wird es erst danach also auch 3
 * Teil b: see code
 * Teil c: es müsste == heißen
 */
