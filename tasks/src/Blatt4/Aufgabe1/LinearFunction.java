package Blatt4.Aufgabe1;

public class LinearFunction implements Evaluierbar {
    private final int factor;
    private final int offset;

    public LinearFunction(int factor, int offset) {
        this.factor = factor;
        this.offset = offset;
    }

    @Override
    public int evaluate(int x) {
        return factor * x + offset;
    }

    @Override
    public String getName() {
        return factor + "* x+ " + offset;
    }
}
