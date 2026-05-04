package main;

public enum LengthUnit implements IMeasurable {
    INCH(1.0), FEET(12.0), YARD(36.0);

    private final double factor;

    LengthUnit(double factor) { this.factor = factor; }

    public double toBase(double value) { return value * factor; }

    public double fromBase(double baseValue) { return baseValue / factor; }
}