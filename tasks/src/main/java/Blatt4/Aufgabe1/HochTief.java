package Blatt4.Aufgabe1;

import java.util.Random;
import java.util.Scanner;

public class HochTief extends Spiel {
    private final Scanner scanner;
    private final int rand;

    public HochTief(String name) {
        super(name);
        scanner = new Scanner(System.in);
        rand = new Random().nextInt(100);
    }

    @Override
    int spiele() {
        System.out.println("Spiel " + getName() + " beginnt");
        for (int i = 0; i < 5; i++) {
            System.out.println("Rate random number 0-100");
            int result = scanner.nextInt();
            if (result == rand) {
                return getEinsatz() * 2;
            } else if (result < rand) {
                System.out.println("Die Zahl ist größer. Versuche es noch einmal.");
            } else {
                System.out.println("Die Zahl ist kleiner. Versuche es noch einmal.");
            }
        }
        System.out.println("Game over");
        return 0;
    }
}
