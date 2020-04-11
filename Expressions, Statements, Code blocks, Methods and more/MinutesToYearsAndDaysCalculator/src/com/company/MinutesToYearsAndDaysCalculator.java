package com.company;

public class MinutesToYearsAndDaysCalculator {

    //write a method printYearsAndDays with param of type long named minutes
    //the method should return void and it needs to calculate the years and days from thr minutes param
    //if minutes < 0 print text "Invalid Value"
    //otherwise prints a message in "XX min = YY y and ZZ d"

    public static void printYearsAndDays(long minutes) {
        public static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println("Invalid Value");
            } else {
                long years = minutes / (365 * 24 * 60);
                long days = (minutes % (365 * 24 * 60)) / (60 * 24);
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }
}
