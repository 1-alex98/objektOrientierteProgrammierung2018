package Blatt4.Aufgabe1;

public class EFunction implements Evaluierbar {
    private final int factor;

    public EFunction(int factor) {
        this.factor = factor;
    }

    @Override
    public int evaluate(int x) {
        return (int) (Math.exp(x) * factor);
    }

    @Override
    public String getName() {
        return factor + "* e ^ x";
    }
}
