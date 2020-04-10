package com.company;

public class MinutesToYearsAndDaysCalculator {

    //write a method printYearsAndDays with param of type long named minutes
    //the method should return void and it needs to calculate the years and days from thr minutes param
    //if minutes < 0 print text "Invalid Value"
    //otherwise prints a message in "XX min = YY y and ZZ d"

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0 ) {
        System.out.println("Invalid Value");
    } else {
        long  hours = minutes / 60;
        long days = hours / 24;
        long years =  days / 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}

}
