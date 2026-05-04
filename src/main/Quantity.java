package main;

public class Quantity {

    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
        return unit.toBase(value);
    }

    private void validateSameType(Quantity other) {
        if (this.unit.getType() != other.unit.getType()) {
            throw new IllegalArgumentException("Cannot operate on different unit types");
        }
    }

    public Quantity add(Quantity other) {
        validateSameType(other);

        double result = this.toBase() + other.toBase();

        // return in base unit of that type
        Unit baseUnit;
        switch (unit.getType()) {
            case LENGTH:
                baseUnit = Unit.INCH;
                break;
            case VOLUME:
                baseUnit = Unit.LITER;
                break;
            case WEIGHT:
                baseUnit = Unit.KILOGRAM;
                break;
            default:
                throw new RuntimeException("Unknown type");
        }

        return new Quantity(result, baseUnit);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Quantity)) return false;

        Quantity other = (Quantity) obj;

        if (this.unit.getType() != other.unit.getType())
            return false;

        return Double.compare(this.toBase(), other.toBase()) == 0;
    }
}