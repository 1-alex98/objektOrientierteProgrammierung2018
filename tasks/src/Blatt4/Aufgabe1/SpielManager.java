package Blatt4.Aufgabe1;

import java.util.Scanner;

public class SpielManager {
    private final Scanner scanner = new Scanner(System.in);
    private int captital;

    public SpielManager(int captital) {
        this.captital = captital;
    }

    protected void printKapital() {
        System.out.println("Kapital: " + captital);
    }

    protected void startSpiel(Spiel spiel) {
        System.out.println("Ihr Kapital ist " + captital + " Spiel mit Namen " + spiel.getName() + " wird gestartet. Geben Sie jetzt den Einsatz an.");
        int i = scanner.nextInt();
        if (i > captital || i <= 0) {
            System.out.println("Eingabe ungültig");
            return;
        }
        spiel.setEinsatz(i);
        captital -= i;
        int result = spiel.spiele();
        captital += result;
        System.out.println("Neues Kapital: " + captital);
    }

    public int getCaptital() {
        return captital;
    }
}
