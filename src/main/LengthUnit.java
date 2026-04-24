package main;

public enum LengthUnit {

    FEET(1.0),
    INCH(1.0 / 12.0),
    YARDS(3.0),
    CENTIMETERS(1.0 / 30.48);

    private final double toFeetFactor;

    LengthUnit(double toFeetFactor) {
        this.toFeetFactor = toFeetFactor;
    }

    // Convert value in this unit → base unit (FEET)
    public double convertToBaseUnit(double value) {
        return value * toFeetFactor;
    }

    // Convert value from base unit (FEET) → this unit
    public double convertFromBaseUnit(double baseValue) {
        return baseValue / toFeetFactor;
    }

    public double getConversionFactor() {
        return toFeetFactor;
    }
}