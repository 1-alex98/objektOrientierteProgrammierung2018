package Blatt4.Aufgabe1;

public abstract class Spiel {
    private final String name;
    private int einsatz;

    protected Spiel(String name) {
        this.name = name;
    }


    protected String getName() {
        return name;
    }

    protected int getEinsatz() {
        return einsatz;
    }

    protected void setEinsatz(int einsatz) {
        this.einsatz = einsatz;
    }

    abstract int spiele();
}
