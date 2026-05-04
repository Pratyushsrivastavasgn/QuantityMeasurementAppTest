package main;

public enum VolumeUnit {
    LITER(1.0),
    MILLILITER(0.001),
    GALLON(3.78);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double toBase(double value) {
        return value * conversionFactor;
    }
}