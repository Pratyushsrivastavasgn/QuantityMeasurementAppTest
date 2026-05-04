package main;

public class QuantityMeasurementAppMainUC9 {
    public static void main(String[] args) {
        QuantityVolume v1 = new QuantityVolume(1, VolumeUnit.GALLON);
        QuantityVolume v2 = new QuantityVolume(3.78, VolumeUnit.LITER);

        System.out.println(v1.equals(v2));
    }
}