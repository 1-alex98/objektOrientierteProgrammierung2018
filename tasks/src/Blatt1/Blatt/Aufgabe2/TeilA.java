package Blatt1.Blatt.Aufgabe2;

import java.util.Scanner;

public class TeilA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie heißen Sie?");
        String input = scanner.nextLine();
        System.out.println("Hallo " + input + "!");
        scanner.close();

    }
}
