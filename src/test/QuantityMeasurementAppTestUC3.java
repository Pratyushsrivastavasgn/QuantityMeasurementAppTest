package test;
import main.QuantityMeasurementAppMainUC3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuantityMeasurementAppTestUC3 {
    @Test
    void testEquality_FeetToFeet_SameValue() {
        var a =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.FEET
                );
        var b =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.FEET
                );
        assertTrue(a.equals(b));
    }
    @Test
    void testEquality_InchToInch_SameValue() {
        var a =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.INCH
                );
        var b =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.INCH
                );
        assertTrue(a.equals(b));
    }
    @Test
    void testEquality_FeetToInch_EquivalentValue() {
        var feet =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.FEET
                );
        var inch =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        12.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.INCH
                );
        assertTrue(feet.equals(inch));
    }
    @Test
    void testEquality_InchToFeet_EquivalentValue() {
        var inch =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        12.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.INCH
                );
        var feet =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.FEET
                );
        assertTrue(inch.equals(feet));
    }
    @Test
    void testEquality_FeetDifferentValue() {
        var a =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.FEET
                );
        var b =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        2.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.FEET
                );
        assertFalse(a.equals(b));
    }
    @Test
    void testEquality_InchDifferentValue() {
        var a =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.INCH
                );
        var b =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        2.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.INCH
                );
        assertFalse(a.equals(b));
    }
    @Test
    void testEquality_SameReference() {
        var a =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.FEET
                );
        assertTrue(a.equals(a));
    }
    @Test
    void testEquality_NullComparison() {
        var a =
                new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        QuantityMeasurementAppMainUC3.LengthUnit.FEET
                );
        assertFalse(a.equals(null));
    }
    @Test
    void testEquality_NullUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityMeasurementAppMainUC3.QuantityLength(
                        1.0,
                        null
                )
        );
    }
}