package com.QuantityMeasurementApp;

import java.util.*;

public class GenericLength {

    // Enum for units
    enum LengthUnit{

        FEET(1.0),
        INCH(1.0/12.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor){
            this.conversionFactor=conversionFactor;
        }

        public double toFeet(double value){
            return value*conversionFactor;
        }

        public static LengthUnit fromString(String unit){
            if(unit.equalsIgnoreCase("feet")||unit.equalsIgnoreCase("ft")){
                return FEET;
            }
            if(unit.equalsIgnoreCase("inch")||unit.equalsIgnoreCase("in")){
                return INCH;
            }
            throw new IllegalArgumentException("Invalid unit");
        }
    }

    // Generic Quantity Class
    static class QuantityLength{

        private final double value;
        private final LengthUnit unit;

        public QuantityLength(double value,LengthUnit unit){
            if(unit==null){
                throw new IllegalArgumentException("Unit cannot be null");
            }
            this.value=value;
            this.unit=unit;
        }

        private double convertToBase(){
            return unit.toFeet(value);
        }

        @Override
        public boolean equals(Object obj){

            if(this==obj){
                return true;
            }

            if(obj==null||getClass()!=obj.getClass()){
                return false;
            }

            QuantityLength other=(QuantityLength)obj;

            double v1=this.convertToBase();
            double v2=other.convertToBase();

            return Double.compare(v1,v2)==0;
        }
    }

    // Main Method (User Input)
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first value:");
        double value1=scanner.nextDouble();
        System.out.println("Enter first unit (feet/inch):");
        String unit1=scanner.next();

        System.out.println("Enter second value:");
        double value2=scanner.nextDouble();
        System.out.println("Enter second unit (feet/inch):");
        String unit2=scanner.next();

        QuantityLength q1=new QuantityLength(value1,
                LengthUnit.fromString(unit1));

        QuantityLength q2=new QuantityLength(value2,
                LengthUnit.fromString(unit2));

        boolean result=q1.equals(q2);

        System.out.println("Equal : "+result);

        scanner.close();
    }
}