package test;

import main.LengthUnit;
import main.QuantityLength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTestUC8 {

    @Test
    void testEquality_YardToYard_SameValue() {
        var a = new QuantityLength(1, LengthUnit.YARDS);
        var b = new QuantityLength(1, LengthUnit.YARDS);
        assertTrue(a.equals(b));
    }

    @Test
    void testEquality_YardToFeet() {
        var yard = new QuantityLength(1, LengthUnit.YARDS);
        var feet = new QuantityLength(3, LengthUnit.FEET);
        assertTrue(yard.equals(feet));
    }

    @Test
    void testEquality_YardToInch() {
        var yard = new QuantityLength(1, LengthUnit.YARDS);
        var inch = new QuantityLength(36, LengthUnit.INCH);
        assertTrue(yard.equals(inch));
    }

    @Test
    void testEquality_CmToInch() {
        var cm = new QuantityLength(2.54, LengthUnit.CENTIMETERS);
        var inch = new QuantityLength(1, LengthUnit.INCH);
        assertTrue(cm.equals(inch));
    }

    @Test
    void testAddition_FeetAndInch() {
        var feet = new QuantityLength(1, LengthUnit.FEET);
        var inch = new QuantityLength(12, LengthUnit.INCH);

        var result = feet.add(inch, LengthUnit.FEET);

        assertEquals(2.0, result.convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET), String.valueOf(0.0001));
    }

    @Test
    void testNullUnit() {
        assertThrows(IllegalArgumentException.class,
                () -> new QuantityLength(1, null));
    }

    @Test
    void testSameReference() {
        var a = new QuantityLength(1, LengthUnit.FEET);
        assertTrue(a.equals(a));
    }

    @Test
    void testNullComparison() {
        var a = new QuantityLength(1, LengthUnit.FEET);
        assertFalse(a.equals(null));
    }
}