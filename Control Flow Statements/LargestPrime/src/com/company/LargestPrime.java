package com.company;

public class LargestPrime {

    //write method getLargestPrime with one param of type int called number
    //if number < 0 or does not have any prime numbers, return -1
    //method should return largest prime factor of given number

    public static int getLargestPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;
        }
        return -1;
    }
}
