package com.company;

public class Main {

    public static void main(String[] args) {

        float myFloat = 123.45F; ///// or
        float mySecondFloat = 123.45f ;

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatvalue = Float.MAX_VALUE;
        System.out.println("Minimum float value : " + myMinFloatValue);
        System.out.println("Maximim float value : " + myMaxFloatvalue);

        double myDouble = 123.45d;
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum double value: " + myMinDoubleValue);
        System.out.println("Maximum double value :" + myMaxDoubleValue);
//
        int myIntValue = 5 /2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntVal= " + myIntValue);
        System.out.println("MyFloatVal = " + myFloatValue);
        System.out.println("MyDoubleVal = " + myDoubleValue);

//
//        /////////////Challenge ***** pounds to kg conversion *****/////////
        double myPounds = 200;
        double pound = 0.45359237;
        double myNumKilo = myPounds * pound;
        System.out.println(myNumKilo);

    }
}
