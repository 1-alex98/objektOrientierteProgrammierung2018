package OnlineAufgabe1;

public class EFunction implements Function {
    private final double a;
    private final double b;

    public EFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double evaluate(double x) {
        return a * Math.exp(b * x);
    }

    @Override
    public Function derivate() {
        return new EFunction(a * b, b);
    }

    @Override
    public String toString() {
        return a + "*e^(" + b + "*x)";
    }
}
