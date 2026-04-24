package test;

import main.QuantityMeasurementAppMainUC1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementAppTestUC1 {
    @Test
    void testEquality_SameValue() {
        QuantityMeasurementAppMainUC1.Feet a =
                new QuantityMeasurementAppMainUC1.Feet(1.0);
        QuantityMeasurementAppMainUC1.Feet b =
                new QuantityMeasurementAppMainUC1.Feet(1.0);
        assertTrue(a.equals(b));
    }
    @Test
    void testEquality_DifferentValue() {
        QuantityMeasurementAppMainUC1.Feet a =
                new QuantityMeasurementAppMainUC1.Feet(1.0);
        QuantityMeasurementAppMainUC1.Feet b =
                new QuantityMeasurementAppMainUC1.Feet(2.0);
        assertFalse(a.equals(b));
    }
    @Test
    void testEquality_NullComparison() {
        QuantityMeasurementAppMainUC1.Feet a =
                new QuantityMeasurementAppMainUC1.Feet(1.0);
        assertFalse(a.equals(null));
    }
    @Test
    void testEquality_SameReference() {
        QuantityMeasurementAppMainUC1.Feet a =
                new QuantityMeasurementAppMainUC1.Feet(1.0);
        assertTrue(a.equals(a));
    }
}