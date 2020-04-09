package com.company;

public class AreaCalculator {

    //write method named area with one double param
    //The method returns a double value trat represents the area of a circle
    //if param radius is negatibve return -1
    //write another overloaded method with 2 params x and y
    //the method returns an area of a rectangle
    //if either or both params are negative,return -1

    public static double area(double radius) {

        if( radius < 0 ) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if( x < 0 || y < 0 ) {
            return -1;
        }
        return  x* y;
    }
}
