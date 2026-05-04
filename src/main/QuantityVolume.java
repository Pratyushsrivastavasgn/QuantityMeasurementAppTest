package main;

public class QuantityVolume {
    private final double value;
    private final VolumeUnit unit;

    public QuantityVolume(double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
        return unit.toBase(value); // base = liter
    }

    public QuantityVolume add(QuantityVolume other) {
        double result = this.toBase() + other.toBase();
        return new QuantityVolume(result, VolumeUnit.LITER);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuantityVolume)) return false;

        QuantityVolume other = (QuantityVolume) obj;
        return Double.compare(this.toBase(), other.toBase()) == 0;
    }
}