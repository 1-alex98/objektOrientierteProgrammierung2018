package Blatt4.Aufgabe1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpielManager spielManager = new SpielManager(50);
        while (spielManager.getCaptital() > 0) {
            spielManager.printKapital();
            System.out.println("Welches Spiel möchten Sie Spielen 0=HochTief 1=FunctionGuessing?");
            int i = scanner.nextInt();
            if (i == 1) {
                spielManager.startSpiel(new FunctionGuessing("'Funktione Raten'"));
            } else {
                spielManager.startSpiel(new HochTief("'Hoch Tief'"));
            }
        }
        System.out.println("Geld weg");

    }
}
