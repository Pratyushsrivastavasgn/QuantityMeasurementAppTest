package test;
import main.QuantityMeasurementAppMainUC7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuantityMeasurementAppTestUC7 {
    double eps=1e-3;
    @Test
    void testAddition_TargetFeet(){
        var result=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                new QuantityMeasurementAppMainUC7
                                        .QuantityLength(
                                        1,
                                        QuantityMeasurementAppMainUC7
                                                .LengthUnit.FEET),
                                new QuantityMeasurementAppMainUC7
                                        .QuantityLength(
                                        12,
                                        QuantityMeasurementAppMainUC7
                                                .LengthUnit.INCH),
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.FEET
                        );
        assertEquals(
                2,
                result.getValue(),
                eps
        );
    }
    @Test
    void testAddition_TargetInches(){
        var result=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                1,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.FEET,
                                12,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH
                        );
        assertEquals(
                24,
                result.getValue(),
                eps
        );
    }
    @Test
    void testAddition_TargetYards(){
        var result=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                1,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.FEET,
                                12,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.YARDS
                        );
        assertEquals(
                0.6667,
                result.getValue(),
                1e-2
        );

    }
    @Test
    void testAddition_TargetCentimeters(){

        var result=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                1,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH,
                                1,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.CENTIMETERS
                        );

        assertEquals(
                5.08,
                result.getValue(),
                1e-2
        );

    }
    @Test
    void testAddition_Commutativity(){

        var a=
                new QuantityMeasurementAppMainUC7
                        .QuantityLength(
                        1,
                        QuantityMeasurementAppMainUC7
                                .LengthUnit.FEET);

        var b=
                new QuantityMeasurementAppMainUC7
                        .QuantityLength(
                        12,
                        QuantityMeasurementAppMainUC7
                                .LengthUnit.INCH);

        var r1=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                a,b,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.YARDS
                        );

        var r2=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                b,a,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.YARDS
                        );

        assertTrue(
                r1.equals(r2)
        );

    }
    @Test
    void testAddition_WithZero(){

        var result=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                5,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.FEET,
                                0,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.YARDS
                        );

        assertEquals(
                1.6667,
                result.getValue(),
                1e-2
        );

    }
    @Test
    void testAddition_Negative(){

        var result=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                5,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.FEET,
                                -2,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.FEET,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH
                        );

        assertEquals(
                36,
                result.getValue(),
                eps
        );

    }
    @Test
    void testNullTargetUnit(){
        assertThrows(
                IllegalArgumentException.class,

                ()->QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                1,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.FEET,
                                12,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH,
                                null
                        )
        );

    }



    @Test
    void testLargeToSmallScale(){

        var result=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                1000,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.FEET,
                                500,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.FEET,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH
                        );

        assertEquals(
                18000,
                result.getValue(),
                eps
        );

    }



    @Test
    void testSmallToLargeScale(){

        var result=
                QuantityMeasurementAppMainUC7
                        .QuantityLength.add(
                                12,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH,
                                12,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.INCH,
                                QuantityMeasurementAppMainUC7
                                        .LengthUnit.YARDS
                        );

        assertEquals(
                0.6667,
                result.getValue(),
                1e-2
        );

    }

}
}