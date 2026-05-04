package main;

public enum WeightUnit {
    KILOGRAM(1.0),
    GRAM(0.001),
    TONNE(1000.0);

    private final double factor;

    WeightUnit(double factor) {
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor; // base = kg
    }
}