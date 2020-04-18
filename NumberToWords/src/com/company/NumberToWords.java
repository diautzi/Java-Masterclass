package com.company;

public class NumberToWords {

    //write a method called numberToWords with one int param called number
    //the method should print out the passed number using words for the digits
    //if the number is negative, print "Invalid Value"

    //write method reverse which should have a param of type int called number
    //should return the reversed number, even if negative
    //use the reverse method in the method numberToWords in order to print the words in the correct order

    //write a third method called getDigitCount
    //one param of type int called number
    //if number negative return -1
    //should return the count of the digits in the number
    // to avoid any reversed numbers with leading 0:
    //      e.g. 100 => 001 reversed will print "One"
    //      but we want to print "One Zero Zero"


    public static void numberToWords( int number) {

        if ( number >= 0) {

            int reversedNumber = reverse(number);
            int countDigits = getDigitCount(number);

            for ( int i=0; i < countDigits; i++) {

                int digit = reversedNumber % 10;
                switch(digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber /=10;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse( int number) {
        int reversedNum = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /=10;
        }
        return reversedNum;
    }


    public static int getDigitCount(int number){
        int count =0;
        if ( number < 0 ){
            return -1;
        }
        else if ( number >= 0) {
            if ( number == 0) {
                count = 1;
            }
            while ( number > 0 ) {
                int lastDigit = number % 10;
                number /=10;
                count++;
            }
        }
        return count;
    }
}
