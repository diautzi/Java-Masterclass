package com.company;

public class FactorPrinter {

    //write a method named printFactors with one param of type int named number
    //if number is < 1, the method should print "Invalid Value"
    //the method should print all factors of the number
    //a factor of a number is an integer which divides that number wholly (no remainder)



    public static void printFactors(int number) {
        if (number >= 1) {
            for (int i = number; i > 0; i--) {
                int factor = number / i;
                if (number % i == 0) {
                    System.out.println(factor);
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
