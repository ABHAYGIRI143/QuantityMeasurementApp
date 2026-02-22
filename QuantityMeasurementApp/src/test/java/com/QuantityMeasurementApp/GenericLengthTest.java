package com.QuantityMeasurementApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericLengthTest {

    @Test
    void testEquality_FeetToFeet_SameValue(){
    	GenericLength.QuantityLength q1=
                new GenericLength.QuantityLength(1.0,
                		GenericLength.LengthUnit.FEET);

    	GenericLength.QuantityLength q2=
                new GenericLength.QuantityLength(1.0,
                		GenericLength.LengthUnit.FEET);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_InchToInch_SameValue(){
    	GenericLength.QuantityLength q1=
                new GenericLength.QuantityLength(1.0,
                		GenericLength.LengthUnit.INCH);

    	GenericLength.QuantityLength q2=
                new GenericLength.QuantityLength(1.0,
                		GenericLength.LengthUnit.INCH);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_InchToFeet_EquivalentValue(){
    	GenericLength.QuantityLength q1=
                new GenericLength.QuantityLength(12.0,
                		GenericLength.LengthUnit.INCH);

    	GenericLength.QuantityLength q2=
                new GenericLength.QuantityLength(1.0,
                		GenericLength.LengthUnit.FEET);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_FeetToFeet_DifferentValue(){
    	GenericLength.QuantityLength q1=
                new GenericLength.QuantityLength(1.0,
                		GenericLength.LengthUnit.FEET);

    	GenericLength.QuantityLength q2=
                new GenericLength.QuantityLength(2.0,
                		GenericLength.LengthUnit.FEET);

        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_SameReference(){
    	GenericLength.QuantityLength q=
                new GenericLength.QuantityLength(1.0,
                		GenericLength.LengthUnit.FEET);

        assertTrue(q.equals(q));
    }

    @Test
    void testEquality_NullComparison(){
    	GenericLength.QuantityLength q=
                new GenericLength.QuantityLength(1.0,
                		GenericLength.LengthUnit.FEET);

        assertFalse(q.equals(null));
    }

    @Test
    void testEquality_NullUnit(){
        assertThrows(IllegalArgumentException.class,()->{
            new GenericLength.QuantityLength(1.0,null);
        });
    }
}