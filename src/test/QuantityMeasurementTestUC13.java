package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTestUC13 {

    @Test
    void testAdd_DelegationWorks() {
        var a = new Quantity<>(1.0, LengthUnit.FEET);
        var b = new Quantity<>(12.0, LengthUnit.INCH);

        assertEquals(new Quantity<>(2.0, LengthUnit.FEET), a.add(b));
    }

    @Test
    void testSubtract_DelegationWorks() {
        var a = new Quantity<>(10.0, LengthUnit.FEET);
        var b = new Quantity<>(6.0, LengthUnit.INCH);

        assertEquals(new Quantity<>(9.5, LengthUnit.FEET), a.subtract(b));
    }

    @Test
    void testDivide_DelegationWorks() {
        var a = new Quantity<>(10.0, LengthUnit.FEET);
        var b = new Quantity<>(2.0, LengthUnit.FEET);

        assertEquals(5.0, a.divide(b));
    }

    @Test
    void testValidationConsistency() {
        var a = new Quantity<>(10.0, LengthUnit.FEET);

        assertThrows(IllegalArgumentException.class, () -> a.add(null));
        assertThrows(IllegalArgumentException.class, () -> a.subtract(null));
        assertThrows(IllegalArgumentException.class, () -> a.divide(null));
    }
}