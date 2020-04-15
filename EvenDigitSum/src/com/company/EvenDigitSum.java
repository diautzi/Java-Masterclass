package com.company;

public class EvenDigitSum {

    //write a method named getEvenDigitSum with one param of type int called number
    //the method should return the sum of the even digits within the number;
    // if number < 0 return -1


    public static int getEvenDigitSum( int number) {

        int sum = 0;
        int lastDigit;

        if ( number >= 0) {
            while( number > 0 ) {
                lastDigit = number % 10;
                if ( lastDigit % 2 == 0) {
                    sum += lastDigit;
                    System.out.println("Sum is " + sum);
                }
                System.out.println("Number is " + number);
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}
