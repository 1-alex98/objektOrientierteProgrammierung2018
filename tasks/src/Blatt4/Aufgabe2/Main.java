package Blatt4.Aufgabe2;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Lastwagen();
        System.out.println(auto1.reifen); // Ausgabe 1)
        System.out.println(((Lastwagen) auto1).reifen); // Ausgabe 2)
        System.out.println(auto1.getReifen()); // Ausgabe 3)
        System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4)
    }

    public static class Auto {
        int reifen = 4;

        int getReifen() {
            return this.reifen;
        }
    }

    public static class Lastwagen extends Auto {
        int reifen = 8;

        @Override
        int getReifen() {
            return this.reifen;
        }
    }
    // Besprechen wir mal lieber ich bin sehr schreib faul

}
