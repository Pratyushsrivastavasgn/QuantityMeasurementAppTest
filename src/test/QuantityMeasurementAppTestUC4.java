package test;
import main.QuantityMeasurementAppMainUC4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuantityMeasurementAppTestUC4 {
    @Test
    void testEquality_YardToYard_SameValue(){
        var a=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.YARDS);
        var b=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.YARDS);
        assertTrue(a.equals(b));
    }
    @Test
    void testEquality_YardToYard_DifferentValue(){
        var a=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.YARDS);
        var b=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        2,
                        QuantityMeasurementAppMainUC4.LengthUnit.YARDS);
        assertFalse(a.equals(b));
    }
    @Test
    void testEquality_YardToFeet(){
        var yard=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.YARDS);
        var feet=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        3,
                        QuantityMeasurementAppMainUC4.LengthUnit.FEET);
        assertTrue(yard.equals(feet));
    }
    @Test
    void testEquality_YardToInches(){
        var yard=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.YARDS);
        var inch=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        36,
                        QuantityMeasurementAppMainUC4.LengthUnit.INCH);
        assertTrue(yard.equals(inch));
    }
    @Test
    void testEquality_CmToCm(){
        var a=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        2,
                        QuantityMeasurementAppMainUC4.LengthUnit.CENTIMETERS);
        var b=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        2,
                        QuantityMeasurementAppMainUC4.LengthUnit.CENTIMETERS);
        assertTrue(a.equals(b));
    }
    @Test
    void testEquality_CmToInch(){
        var cm=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.CENTIMETERS);
        var inch=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        0.393701,
                        QuantityMeasurementAppMainUC4.LengthUnit.INCH);
        assertTrue(cm.equals(inch));
    }
    @Test
    void testEquality_CmToFeet_NotEqual(){
        var cm=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.CENTIMETERS);
        var feet=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.FEET);
        assertFalse(cm.equals(feet));
    }
    @Test
    void testTransitiveProperty(){
        var yard=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.YARDS);
        var feet=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        3,
                        QuantityMeasurementAppMainUC4.LengthUnit.FEET);
        var inch=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        36,
                        QuantityMeasurementAppMainUC4.LengthUnit.INCH);
        assertTrue(yard.equals(feet));
        assertTrue(feet.equals(inch));
        assertTrue(yard.equals(inch));
    }
    @Test
    void testSameReference(){
        var a=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.YARDS);
        assertTrue(a.equals(a));
    }
    @Test
    void testNullComparison(){
        var a=
                new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC4.LengthUnit.YARDS);
        assertFalse(a.equals(null));
    }
    @Test
    void testNullUnit(){
        assertThrows(
                IllegalArgumentException.class,
                ()->new QuantityMeasurementAppMainUC4.QuantityLength(
                        1,
                        null
                )
        );
    }
}