package Blatt3.Aufgabe2;

public class Fur implements Cloneable {
    public int length;

    public Fur(int length) {
        this.length = length;
    }

    public String toString() {
        return "Felllaenge: " + length;
    }

    @Override
    public Fur clone() {
        return new Fur(length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fur)) return false;

        Fur fur = (Fur) o;

        return length == fur.length;
    }
}
