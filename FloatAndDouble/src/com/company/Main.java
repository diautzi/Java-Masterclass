package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatvalue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatvalue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoublevalue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoublevalue);

        int myIntValue = 5 /2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntVal= " + myIntValue);
        System.out.println("MyFloatVal = " + myFloatValue);
        System.out.println("MyDoubleVal = " + myDoubleValue);


        /////////////Challenge ***** pounds to kg conversion *****/////////
        double myPounds = 200;
        double pound = 0.45359237;
        double myNumKilo = myPounds * pound;
        System.out.println(myNumKilo);
        
    }
}
