package main;

public class QuantityMeasurementAppMainUC8 {

    public static void main(String[] args) {

        QuantityLength yard =
                new QuantityLength(1, LengthUnit.YARDS);

        QuantityLength feet =
                new QuantityLength(3, LengthUnit.FEET);

        QuantityLength inch =
                new QuantityLength(1, LengthUnit.INCH);

        QuantityLength cm =
                new QuantityLength(2.54, LengthUnit.CENTIMETERS);

        System.out.println("1 yard == 3 feet: " + yard.equals(feet));
        System.out.println("2.54 cm == 1 inch: " + cm.equals(inch));

        QuantityLength result =
                yard.add(feet, LengthUnit.YARDS);

        System.out.println("1 yard + 3 feet = " + result);
    }
}