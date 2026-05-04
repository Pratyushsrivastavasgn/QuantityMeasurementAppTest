package test;

import main.QuantityWeight;
import main.WeightUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTestUC10 {

    @Test
    void testEquality_KgToKg_SameValue() {
        var a = new QuantityWeight(1, WeightUnit.KILOGRAM);
        var b = new QuantityWeight(1, WeightUnit.KILOGRAM);
        assertEquals(a, b);
    }

    @Test
    void testEquality_GramToKg_EquivalentValue() {
        var a = new QuantityWeight(1000, WeightUnit.GRAM);
        var b = new QuantityWeight(1, WeightUnit.KILOGRAM);
        assertEquals(a, b);
    }

    @Test
    void testEquality_TonneToKg_EquivalentValue() {
        var a = new QuantityWeight(1, WeightUnit.TONNE);
        var b = new QuantityWeight(1000, WeightUnit.KILOGRAM);
        assertEquals(a, b);
    }

    @Test
    void testInequality_DifferentValues() {
        var a = new QuantityWeight(1, WeightUnit.KILOGRAM);
        var b = new QuantityWeight(2, WeightUnit.KILOGRAM);
        assertNotEquals(a, b);
    }
}