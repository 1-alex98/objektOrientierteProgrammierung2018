package Blatt5.Aufgabe2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Körper> körperList = new ArrayList<>();
        körperList.add(new Quader(new Punkt(1, 2, 3), 2, 4, 7));
        körperList.add(new Kugel(new Punkt(2, 4, 6), 77));

        körperList.forEach(System.out::println);
    }
}
