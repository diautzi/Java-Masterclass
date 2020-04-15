package com.company;

public class FirstAndLastDigitSum {
    //wtite a method sumFirstAndLastDigit with one param of type int called number
    //the methods need to finf the first and last digit of the param number passed in
    //using a loop and return the sum of the first and last digit of that number
    //if number < 0 methods return -1;


    public static int sumFirstAndLAstDigit( int number) {

        int lastDigit = number % 10;
        int sum = 0;
        int firstDigit = 0;

        if ( number >= 0 && number < 10) {
            sum = number + lastDigit;
        }
        else if ( number >= 10){
            while ( number >= 10) {
                //find first number
                number = number / 10;
                firstDigit = number;
                System.out.println("First digit is " + firstDigit);
                sum = firstDigit + lastDigit;
            }
        }
        else {
            sum = -1;
        }
        return sum;
    }
}
