package com.QuantityMeasurementApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeetInchesEqualityTest {

    @Test
    void testFeetEquality_SameValue(){
        assertTrue(FeetInchesEquality.checkFeetEquality(1.0,1.0));
    }

    @Test
    void testFeetEquality_DifferentValue(){
        assertFalse(FeetInchesEquality.checkFeetEquality(1.0,2.0));
    }

    @Test
    void testInchesEquality_SameValue(){
        assertTrue(FeetInchesEquality.checkInchesEquality(1.0,1.0));
    }

    @Test
    void testInchesEquality_DifferentValue(){
        assertFalse(FeetInchesEquality.checkInchesEquality(1.0,2.0));
    }

    @Test
    void testFeetEquality_NullComparison(){
    	FeetInchesEquality.Feet f=new FeetInchesEquality.Feet(1.0);
        assertFalse(f.equals(null));
    }

    @Test
    void testFeetEquality_SameReference(){
    	FeetInchesEquality.Feet f=new FeetInchesEquality.Feet(1.0);
        assertTrue(f.equals(f));
    }
}
