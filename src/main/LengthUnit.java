package main;

public enum LengthUnit {
    INCH(1.0),
    FEET(12.0),
    YARD(36.0);

    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    public double getConversionFactor() {
        return factor;
    }
}