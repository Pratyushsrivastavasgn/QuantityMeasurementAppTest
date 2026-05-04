package main;

public class QuantityWeight {
    private final double value;
    private final WeightUnit unit;

    public QuantityWeight(double value, WeightUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
        return unit.toBase(value);
    }

    public QuantityWeight add(QuantityWeight other) {
        double result = this.toBase() + other.toBase();
        return new QuantityWeight(result, WeightUnit.KILOGRAM);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuantityWeight)) return false;

        QuantityWeight other = (QuantityWeight) obj;
        return Double.compare(this.toBase(), other.toBase()) == 0;
    }
}