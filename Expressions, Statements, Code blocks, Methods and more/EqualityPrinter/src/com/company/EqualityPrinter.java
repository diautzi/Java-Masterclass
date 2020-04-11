package com.company;

public class EqualityPrinter {

    //write a method printEqual with 3 params of type int
    //should return void
    //if one of the params is < 0, print text "Invalid Value"
    //if all numbers are equal print text "All numbers are equal"
    //if all numbers are different print text "All numbers are different"
    //otherwise, print "Neither all are equal or different"

    public static void printEqual(int one, int two, int three ) {

        if ( one < 0 || two < 0 || three < 0) {
            System.out.println("Invald Value");
        } else if (two == three && one == three) {
            System.out.println("All numbers are equal");
        } else if (one != two && two != three && one!= three) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
}
