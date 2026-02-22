package com.QuantityMeasurementApp;

public class FeetEquality {

    // Inner class representing Feet measurement
    static class Feet {

        private final double value;

        public Feet(double value){
            this.value=value;
        }

        public double getValue(){
            return value;
        }

        @Override
        public boolean equals(Object obj){

            // Same reference check
            if(this==obj){
                return true;
            }

            // Null or type check
            if(obj==null||getClass()!=obj.getClass()){
                return false;
            }

            // Cast and compare values
            Feet other=(Feet)obj;
            return Double.compare(this.value,other.value)==0;
        }
    }

    // Main method for testing
    public static void main(String[] args){

        Feet first=new Feet(1.0);
        Feet second=new Feet(1.0);

        boolean result=first.equals(second);

        System.out.println("Are both measurements equal? "+result);
    }
}
