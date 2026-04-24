package test;
import main.QuantityMeasurementAppMainUC5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuantityMeasurementAppTestUC5 {
    double eps=1e-6;
    @Test
    void testConversion_FeetToInches(){
        assertEquals(
                12.0,
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                1,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET,
                                QuantityMeasurementAppMainUC5.LengthUnit.INCH
                        ),
                eps
        );
    }
    @Test
    void testConversion_InchesToFeet(){
        assertEquals(
                2.0,
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                24,
                                QuantityMeasurementAppMainUC5.LengthUnit.INCH,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET
                        ),
                eps
        );
    }
    @Test
    void testConversion_YardsToInches(){
        assertEquals(
                36,
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                1,
                                QuantityMeasurementAppMainUC5.LengthUnit.YARDS,
                                QuantityMeasurementAppMainUC5.LengthUnit.INCH
                        ),
                eps
        );
    }
    @Test
    void testConversion_FeetToYards(){
        assertEquals(
                2,
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                6,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET,
                                QuantityMeasurementAppMainUC5.LengthUnit.YARDS
                        ),
                eps
        );
    }
    @Test
    void testConversion_CmToInches(){
        assertEquals(
                1.0,
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                2.54,
                                QuantityMeasurementAppMainUC5.LengthUnit.CENTIMETERS,
                                QuantityMeasurementAppMainUC5.LengthUnit.INCH
                        ),
                1e-4
        );
    }
    @Test
    void testRoundTrip(){
        double x=5.5;
        double converted=
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                x,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET,
                                QuantityMeasurementAppMainUC5.LengthUnit.CENTIMETERS
                        );
        double back=
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                converted,
                                QuantityMeasurementAppMainUC5.LengthUnit.CENTIMETERS,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET
                        );
        assertEquals(
                x,
                back,
                1e-5
        );
    }
    @Test
    void testZero(){
        assertEquals(
                0,
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                0,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET,
                                QuantityMeasurementAppMainUC5.LengthUnit.INCH
                        ),
                eps
        );
    }
    @Test
    void testNegative(){
        assertEquals(
                -12,
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                -1,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET,
                                QuantityMeasurementAppMainUC5.LengthUnit.INCH
                        ),
                eps
        );
    }
    @Test
    void testSameUnit(){
        assertEquals(
                5,
                QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                5,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET
                        ),
                eps
        );
    }
    @Test
    void testNullUnit(){
        assertThrows(
                IllegalArgumentException.class,
                ()->QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                1,
                                null,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET
                        )
        );
    }
    @Test
    void testNaN(){
        assertThrows(
                IllegalArgumentException.class,

                ()->QuantityMeasurementAppMainUC5
                        .QuantityLength.convert(
                                Double.NaN,
                                QuantityMeasurementAppMainUC5.LengthUnit.FEET,
                                QuantityMeasurementAppMainUC5.LengthUnit.INCH
                        )
        );
    }
}