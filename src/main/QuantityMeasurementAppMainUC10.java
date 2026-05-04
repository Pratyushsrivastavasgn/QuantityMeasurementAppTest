package main;

public class QuantityMeasurementAppMainUC10 {
    public static void main(String[] args) {

        QuantityWeight w1 = new QuantityWeight(1, WeightUnit.TONNE);
        QuantityWeight w2 = new QuantityWeight(1000, WeightUnit.KILOGRAM);

        System.out.println(w1.equals(w2)); // true
    }
}