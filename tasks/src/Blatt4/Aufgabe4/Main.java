package Blatt4.Aufgabe4;

public class Main {
    private static Person[] personen;
    private static Person kleinstePerson;
    private static int test;

    public static void main(String[] args) {
        personen = new Person[10];
        for (int i = 0; i < 10; i++) {
            personen[i] = new Person("Mueller", "Max", 55555, "Musterstrasse", i);
        }

        kleinstePerson = (Person) Minimum.findMin(personen);
        System.out.println(kleinstePerson.getHausnr());

        test = personen[2].compareTo(personen[3]);
        System.out.println(test);
    }
}
