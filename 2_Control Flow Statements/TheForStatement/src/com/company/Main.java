package com.company;

public class Main {

    public static void main(String[] args) {
	 // write your code here

        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        //// for loop in java ///////
        for( int i=1; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        //using the for loop call the calculateInterest method with
        //the amount of 10000 with an interest of 2,3,4,5,6,7 and 8
        // and print thr result to the console window

        System.out.println("Calculating interest starting at 2% up to 8%");

        for( int i = 2; i <= 8; i++) {
            System.out.println("10000 at + " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        //now start calculating at 8% and going down to 2%

        System.out.println("Calculating interest starting at 8% down to 2%");

        for ( int i=8; i >=2; i--) {
            System.out.println("10000 at + " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }


    }


    public static double calculateInterest( double amount, double interestRate) {
        return ( amount * ( interestRate/100));
    }

}
