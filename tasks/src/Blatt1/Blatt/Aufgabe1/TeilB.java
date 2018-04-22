package Blatt1.Blatt.Aufgabe1;

import java.text.MessageFormat;

public class TeilB {
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("parameters mustr be given");
        }

        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        int i3 = Integer.parseInt(args[2]);


        switch (i3) {
            case 0:
                System.out.println(String.format("%d + %d = %d", i1, i2, i1 + i2));
                break;
            case 1:
                System.out.println(String.format("%d - %d = %d", i1, i2, i1 - i2));
                break;
            case 2:
                System.out.println(String.format("%d * %d = %d", i1, i2, i1 * i2));
                break;
            case 3:
                System.out.println(String.format("%d / %d = %d", i1, i2, i1 / i2));
                break;
            default:
                throw new IllegalArgumentException(MessageFormat.format("Operation '{}' not supported", args[2]));
        }
    }
}
