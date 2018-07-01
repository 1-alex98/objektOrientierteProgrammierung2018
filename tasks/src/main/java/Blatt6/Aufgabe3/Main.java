package Blatt6.Aufgabe3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Hamburger c = new Hamburger();
        c.eat();
    }

    static class Hamburger extends Fastfood {
        void eat() {

        }
    }

    static class Fastfood {
        void eat() throws IOException {
        }
    }
}
