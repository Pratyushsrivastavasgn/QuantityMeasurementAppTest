package main;

public enum Unit {

    // LENGTH
    INCH(1.0, UnitType.LENGTH),
    FEET(12.0, UnitType.LENGTH),
    YARD(36.0, UnitType.LENGTH),

    // VOLUME
    LITER(1.0, UnitType.VOLUME),
    MILLILITER(0.001, UnitType.VOLUME),
    GALLON(3.78, UnitType.VOLUME),

    // WEIGHT
    KILOGRAM(1.0, UnitType.WEIGHT),
    GRAM(0.001, UnitType.WEIGHT),
    TONNE(1000.0, UnitType.WEIGHT);

    private final double factor;
    private final UnitType type;

    Unit(double factor, UnitType type) {
        this.factor = factor;
        this.type = type;
    }

    public double toBase(double value) {
        return value * factor;
    }

    public UnitType getType() {
        return type;
    }
}