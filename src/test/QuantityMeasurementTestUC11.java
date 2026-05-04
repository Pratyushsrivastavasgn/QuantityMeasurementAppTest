package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTestUC11 {

    @Test
    void testAdd_Length() {
        var a = new QuantityLength(1, LengthUnit.FEET);   // 12 inch
        var b = new QuantityLength(2, LengthUnit.INCH);   // 2 inch

        var result = a.add(b);

        assertEquals(new QuantityLength(14, LengthUnit.INCH), result);
    }

    @Test
    void testAdd_Volume() {
        var a = new QuantityVolume(1, VolumeUnit.LITER);
        var b = new QuantityVolume(1000, VolumeUnit.MILLILITER);

        var result = a.add(b);

        assertEquals(new QuantityVolume(2, VolumeUnit.LITER), result);
    }

    @Test
    void testAdd_Weight() {
        var a = new QuantityWeight(1, WeightUnit.KILOGRAM);
        var b = new QuantityWeight(500, WeightUnit.GRAM);

        var result = a.add(b);

        assertEquals(new QuantityWeight(1.5, WeightUnit.KILOGRAM), result);
    }
}
