package main;

public class QuantityLength {
    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
        return value * unit.getConversionFactor(); // base = inches
    }

    public QuantityLength add(QuantityLength other) {
        double result = this.toBase() + other.toBase();
        return new QuantityLength(result, LengthUnit.INCH); // return in base
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuantityLength)) return false;

        QuantityLength other = (QuantityLength) obj;
        return Double.compare(this.toBase(), other.toBase()) == 0;
    }
}