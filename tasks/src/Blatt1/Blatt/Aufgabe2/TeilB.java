package Blatt1.Blatt.Aufgabe2;

import java.util.Scanner;

public class TeilB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();
        System.out.println(String.format("%d +%d = = %d", i, i1, i + i1));
    }
}