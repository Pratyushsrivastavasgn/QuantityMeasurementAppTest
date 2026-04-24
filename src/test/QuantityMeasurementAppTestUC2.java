package test;
import main.QuantityMeasurementAppMainUC2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuantityMeasurementAppTestUC2 {
    @Test
    void testFeetEquality_SameValue() {
        assertTrue(
                QuantityMeasurementAppMainUC2.compareFeet(1.0,1.0)
        );
    }
    @Test
    void testFeetEquality_DifferentValue() {
        assertFalse(
                QuantityMeasurementAppMainUC2.compareFeet(1.0,2.0)
        );
    }
    @Test
    void testFeetEquality_NullComparison() {
        QuantityMeasurementAppMainUC2.Feet f =
                new QuantityMeasurementAppMainUC2.Feet(1.0);
        assertFalse(f.equals(null));
    }
    @Test
    void testFeetEquality_SameReference() {
        QuantityMeasurementAppMainUC2.Feet f =
                new QuantityMeasurementAppMainUC2.Feet(1.0);
        assertTrue(f.equals(f));
    }
    @Test
    void testInchesEquality_SameValue() {
        assertTrue(
                QuantityMeasurementAppMainUC2.compareInches(1.0,1.0)
        );
    }
    @Test
    void testInchesEquality_DifferentValue() {
        assertFalse(
                QuantityMeasurementAppMainUC2.compareInches(1.0,2.0)
        );
    }
    @Test
    void testInchesEquality_NullComparison() {
        QuantityMeasurementAppMainUC2.Inches i =
                new QuantityMeasurementAppMainUC2.Inches(1.0);
        assertFalse(i.equals(null));
    }
    @Test
    void testInchesEquality_SameReference() {
        QuantityMeasurementAppMainUC2.Inches i =
                new QuantityMeasurementAppMainUC2.Inches(1.0);
        assertTrue(i.equals(i));
    }
    @Test
    void testEquality_NonNumericInput() {
        QuantityMeasurementAppMainUC2.Inches i =
                new QuantityMeasurementAppMainUC2.Inches(1.0);
        String text = "abc";
        assertFalse(i.equals(text));
    }
}