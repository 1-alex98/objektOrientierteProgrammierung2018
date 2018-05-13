package Blatt3.Aufgabe4;

public class Singelton {
    private static Singelton ourInstance = new Singelton();

    private Singelton() {
    }

    public static Singelton getInstance() {
        return ourInstance;
    }
}
