package Blatt4.Aufgabe1;

import java.util.Random;
import java.util.Scanner;

public class FunctionGuessing extends Spiel {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private final Evaluierbar function;

    public FunctionGuessing(String name) {
        super(name);
        if (random.nextBoolean()) {
            function = new EFunction(random.nextInt());
        } else {
            function = new LinearFunction(random.nextInt(), random.nextInt());
        }
    }

    @Override
    int spiele() {
        System.out.println("Das Spiel " + getName() + " beginnt");
        System.out.println("Ihre Funktion lauten " + function.getName());
        int i = random.nextInt(49) + 1;
        System.out.println("Berechnen Sie den Wert für " + i + " , und geben Sie diesen jetzt an.");
        int input = scanner.nextInt();
        System.out.println("Wert ist " + function.evaluate(i));
        if (Math.abs(input - function.evaluate(i)) < 5) {
            System.out.println("Happy Birthday you won.");
            return getEinsatz() + i;
        }
        System.out.println("Daneben");
        return 0;
    }
}
