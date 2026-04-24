package test;
import main.QuantityMeasurementAppMainUC6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuantityMeasurementAppTestUC6 {

    double eps=1e-6;



    @Test
    void testAddition_FeetPlusFeet(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        2,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        assertEquals(
                3,
                a.add(b).getValue(),
                eps
        );
    }



    @Test
    void testAddition_InchesPlusInches(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        6,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.INCH);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        6,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.INCH);

        assertEquals(
                12,
                a.add(b).getValue(),
                eps
        );
    }



    @Test
    void testAddition_FeetPlusInches(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        12,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.INCH);

        assertEquals(
                2,
                a.add(b).getValue(),
                eps
        );
    }



    @Test
    void testAddition_InchPlusFeet(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        12,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.INCH);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        assertEquals(
                24,
                a.add(b).getValue(),
                eps
        );
    }



    @Test
    void testAddition_YardPlusFeet(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.YARDS);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        3,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        assertEquals(
                2,
                a.add(b).getValue(),
                eps
        );
    }



    @Test
    void testAddition_CmPlusInch(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        2.54,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.CENTIMETERS);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.INCH);

        assertEquals(
                5.08,
                a.add(b).getValue(),
                1e-3
        );
    }



    @Test
    void testAddition_Commutative(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        12,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.INCH);

        assertTrue(
                a.add(b).equals(
                        b.add(a)
                )
        );
    }



    @Test
    void testAddition_Zero(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        5,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        var zero=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        0,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.INCH);

        assertEquals(
                5,
                a.add(zero).getValue(),
                eps
        );
    }



    @Test
    void testAddition_Negative(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        5,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        -2,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        assertEquals(
                3,
                a.add(b).getValue(),
                eps
        );
    }



    @Test
    void testAddition_NullOperand(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        assertThrows(
                IllegalArgumentException.class,
                ()->a.add(null)
        );
    }



    @Test
    void testLargeValues(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        1e6,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        1e6,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        assertEquals(
                2e6,
                a.add(b).getValue(),
                eps
        );
    }



    @Test
    void testSmallValues(){

        var a=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        0.001,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        var b=
                new QuantityMeasurementAppMainUC6
                        .QuantityLength(
                        0.002,
                        QuantityMeasurementAppMainUC6
                                .LengthUnit.FEET);

        assertEquals(
                0.003,
                a.add(b).getValue(),
                1e-9
        );
    }

}