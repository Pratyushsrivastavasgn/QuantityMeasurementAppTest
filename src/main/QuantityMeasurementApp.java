package main;

public class QuantityMeasurementApp {
    public static void main(String[] args) {

        var a = new Quantity<>(10.0, LengthUnit.FEET);
        var b = new Quantity<>(6.0, LengthUnit.INCH);

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.divide(new Quantity<>(2.0, LengthUnit.FEET)));
    }
}