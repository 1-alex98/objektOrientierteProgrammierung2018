package Blatt7.Aufgabe3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberToSmallException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter number");
        int i = scanner.nextInt();
        if(i<5)
            throw new NumberToSmallException("Diese Zahl ist kleiner 5");
        if(i>5)
            throw new NumberTooBigException("Diese Zahl ist größer als 5");
    }
}
