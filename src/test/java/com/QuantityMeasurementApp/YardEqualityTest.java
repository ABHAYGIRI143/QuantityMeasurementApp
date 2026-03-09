package com.QuantityMeasurementApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YardEqualityTest {

    @Test
    void testEquality_YardToYard_SameValue(){
    	YardEquality.QuantityLength q1=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
    	YardEquality.QuantityLength q2=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_YardToYard_DifferentValue(){
    	YardEquality.QuantityLength q1=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
    	YardEquality.QuantityLength q2=new YardEquality.QuantityLength(2.0,YardEquality.LengthUnit.YARDS);
        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_YardToFeet_EquivalentValue(){
    	YardEquality.QuantityLength yard=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
    	YardEquality.QuantityLength feet=new YardEquality.QuantityLength(3.0,YardEquality.LengthUnit.FEET);
        assertTrue(yard.equals(feet));
    }

    @Test
    void testEquality_FeetToYard_EquivalentValue(){
    	YardEquality.QuantityLength feet=new YardEquality.QuantityLength(3.0,YardEquality.LengthUnit.FEET);
    	YardEquality.QuantityLength yard=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
        assertTrue(feet.equals(yard));
    }

    @Test
    void testEquality_YardToInches_EquivalentValue(){
    	YardEquality.QuantityLength yard=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
    	YardEquality.QuantityLength inches=new YardEquality.QuantityLength(36.0,YardEquality.LengthUnit.INCHES);
        assertTrue(yard.equals(inches));
    }

    @Test
    void testEquality_InchesToYard_EquivalentValue(){
    	YardEquality.QuantityLength inches=new YardEquality.QuantityLength(36.0,YardEquality.LengthUnit.INCHES);
    	YardEquality.QuantityLength yard=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
        assertTrue(inches.equals(yard));
    }

    @Test
    void testEquality_YardToFeet_NonEquivalentValue(){
    	YardEquality.QuantityLength yard=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
    	YardEquality.QuantityLength feet=new YardEquality.QuantityLength(2.0,YardEquality.LengthUnit.FEET);
        assertFalse(yard.equals(feet));
    }

    @Test
    void testEquality_centimetersToInches_EquivalentValue(){
    	YardEquality.QuantityLength cm=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.CENTIMETERS);
    	YardEquality.QuantityLength inch=new YardEquality.QuantityLength(0.393701,YardEquality.LengthUnit.INCHES);
        assertTrue(cm.equals(inch));
    }

    @Test
    void testEquality_centimetersToFeet_NonEquivalentValue(){
    	YardEquality.QuantityLength cm=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.CENTIMETERS);
    	YardEquality.QuantityLength feet=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.FEET);
        assertFalse(cm.equals(feet));
    }

    @Test
    void testEquality_MultiUnit_TransitiveProperty(){

    	YardEquality.QuantityLength yard=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
    	YardEquality.QuantityLength feet=new YardEquality.QuantityLength(3.0,YardEquality.LengthUnit.FEET);
    	YardEquality.QuantityLength inches=new YardEquality.QuantityLength(36.0,YardEquality.LengthUnit.INCHES);

        assertTrue(yard.equals(feet));
        assertTrue(feet.equals(inches));
        assertTrue(yard.equals(inches));
    }

    @Test
    void testEquality_YardWithNullUnit(){
        assertThrows(IllegalArgumentException.class,()->{
            new YardEquality.QuantityLength(1.0,null);
        });
    }

    @Test
    void testEquality_YardSameReference(){
    	YardEquality.QuantityLength yard=new YardEquality.QuantityLength(2.0,YardEquality.LengthUnit.YARDS);
        assertTrue(yard.equals(yard));
    }

    @Test
    void testEquality_YardNullComparison(){
    	YardEquality.QuantityLength yard=new YardEquality.QuantityLength(1.0,YardEquality.LengthUnit.YARDS);
        assertFalse(yard.equals(null));
    }

    @Test
    void testEquality_CentimetersWithNullUnit(){
        assertThrows(IllegalArgumentException.class,()->{
            new YardEquality.QuantityLength(2.0,null);
        });
    }

    @Test
    void testEquality_CentimetersSameReference(){
    	YardEquality.QuantityLength cm=new YardEquality.QuantityLength(5.0,YardEquality.LengthUnit.CENTIMETERS);
        assertTrue(cm.equals(cm));
    }

    @Test
    void testEquality_CentimetersNullComparison(){
    	YardEquality.QuantityLength cm=new YardEquality.QuantityLength(3.0,YardEquality.LengthUnit.CENTIMETERS);
        assertFalse(cm.equals(null));
    }

    @Test
    void testEquality_AllUnits_ComplexScenario(){

    	YardEquality.QuantityLength yard=new YardEquality.QuantityLength(2.0,YardEquality.LengthUnit.YARDS);
    	YardEquality.QuantityLength feet=new YardEquality.QuantityLength(6.0,YardEquality.LengthUnit.FEET);
    	YardEquality.QuantityLength inches=new YardEquality.QuantityLength(72.0,YardEquality.LengthUnit.INCHES);

        assertTrue(yard.equals(feet));
        assertTrue(feet.equals(inches));
        assertTrue(yard.equals(inches));
    }
}
