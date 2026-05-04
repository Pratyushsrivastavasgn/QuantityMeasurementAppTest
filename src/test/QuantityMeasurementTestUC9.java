package test;

import main.QuantityVolume;
import main.VolumeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTestUC9 {

    @Test
    void testEquality_LiterToLiter_SameValue() {
        var a = new QuantityVolume(1, VolumeUnit.LITER);
        var b = new QuantityVolume(1, VolumeUnit.LITER);
        assertEquals(a, b);
    }

    @Test
    void testEquality_GallonToLiter_EquivalentValue() {
        var a = new QuantityVolume(1, VolumeUnit.GALLON);
        var b = new QuantityVolume(3.78, VolumeUnit.LITER);
        assertEquals(a, b);
    }

    @Test
    void testEquality_MilliliterToLiter_EquivalentValue() {
        var a = new QuantityVolume(1000, VolumeUnit.MILLILITER);
        var b = new QuantityVolume(1, VolumeUnit.LITER);
        assertEquals(a, b);
    }

    @Test
    void testInequality_DifferentValues() {
        var a = new QuantityVolume(1, VolumeUnit.LITER);
        var b = new QuantityVolume(2, VolumeUnit.LITER);
        assertNotEquals(a, b);
    }
}