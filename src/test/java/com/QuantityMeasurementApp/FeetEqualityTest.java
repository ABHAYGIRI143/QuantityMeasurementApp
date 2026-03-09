package com.QuantityMeasurementApp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeetEqualityTest {

    @Test
    void testEquality_SameValue(){
        FeetEquality.Feet f1=new FeetEquality.Feet(1.0);
        FeetEquality.Feet f2=new FeetEquality.Feet(1.0);
        assertTrue(f1.equals(f2));
    }

    @Test
    void testEquality_DifferentValue(){
    	FeetEquality.Feet f1=new FeetEquality.Feet(1.0);
    	FeetEquality.Feet f2=new FeetEquality.Feet(2.0);
        assertFalse(f1.equals(f2));
    }

    @Test
    void testEquality_NullComparison(){
    	FeetEquality.Feet f1=new FeetEquality.Feet(1.0);
        assertFalse(f1.equals(null));
    }

    @Test
    void testEquality_SameReference(){
    	FeetEquality.Feet f1=new FeetEquality.Feet(1.0);
        assertTrue(f1.equals(f1));
    }
}