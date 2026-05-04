package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTestUC12 {

    @Test
    void testAdd_Length() {
        var a = new Quantity(1, Unit.FEET);
        var b = new Quantity(2, Unit.INCH);

        var result = a.add(b);

        assertEquals(new Quantity(14, Unit.INCH), result);
    }

    @Test
    void testAdd_Volume() {
        var a = new Quantity(1, Unit.LITER);
        var b = new Quantity(1000, Unit.MILLILITER);

        var result = a.add(b);

        assertEquals(new Quantity(2, Unit.LITER), result);
    }

    @Test
    void testAdd_Weight() {
        var a = new Quantity(1, Unit.KILOGRAM);
        var b = new Quantity(500, Unit.GRAM);

        var result = a.add(b);

        assertEquals(new Quantity(1.5, Unit.KILOGRAM), result);
    }

    @Test
    void testInvalid_Addition_ShouldThrowException() {
        var length = new Quantity(1, Unit.FEET);
        var weight = new Quantity(1, Unit.KILOGRAM);

        assertThrows(IllegalArgumentException.class, () -> length.add(weight));
    }

    @Test
    void testEquality_DifferentUnits_SameType() {
        var a = new Quantity(1, Unit.FEET);
        var b = new Quantity(12, Unit.INCH);

        assertEquals(a, b);
    }

    @Test
    void testEquality_DifferentTypes_ShouldFail() {
        var a = new Quantity(1, Unit.FEET);
        var b = new Quantity(1, Unit.KILOGRAM);

        assertNotEquals(a, b);
    }
}