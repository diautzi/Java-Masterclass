package com.company;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reversedNumber = 0;
        int lastDigit;

        if (number < 0) {
            number = number * (-1);
            originalNumber = originalNumber * (-1);
        }
        while (number > 0) {
            // extracting the last digit
            lastDigit = number % 10;
//            System.out.println("Last digit is " + lastDigit);
//            System.out.println("Number is " + number);
            // increasing the place value and adding last digit
            reversedNumber = reversedNumber * 10 + lastDigit;
//            System.out.println("Reverse nr is " + reversedNumber);
            // removing last digit from number
            number /= 10;
//            System.out.println("Number is " + number);
        }
        System.out.println("Is a given number of " + originalNumber + " a palindrome?");
        return reversedNumber == originalNumber;
    }
}
