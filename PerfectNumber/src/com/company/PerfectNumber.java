package com.company;

public class PerfectNumber {

    //a perfect number is a positive integer which is equal to the sum of its proper positive divisors
    //proper positive integers are positive integers that fully divide the perfect number without leaving a remainder and exculde the perfect number itself
    // write a method called isPerfectNumber with one param of type int called number
    //if number < 0 return false
    //true if it is perfect number


    public static boolean isPerfectNumber( int number) {
        if ( number < 0 ) {
            return false;
        }
        if( number >= 1) {
            int sum = 0;
            for (int i=1; i < number; i++){
                if ( number % i == 0 ) {
                    sum +=i;
                }
            }
            return (sum == number);
        }
        return false;
    }
}
