package main;

public enum VolumeUnit implements IMeasurable {
    LITER(1.0), MILLILITER(0.001), GALLON(3.78);

    private final double factor;

    VolumeUnit(double factor) { this.factor = factor; }

    public double toBase(double value) { return value * factor; }

    public double fromBase(double baseValue) { return baseValue / factor; }
}