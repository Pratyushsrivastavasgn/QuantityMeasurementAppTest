package main;

public enum WeightUnit {
    KILOGRAM(1.0),
    GRAM(0.001),
    TONNE(1000.0);

    private final double conversionFactor;

    WeightUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double toBase(double value) {
        return value * conversionFactor; // base = kg
    }
}