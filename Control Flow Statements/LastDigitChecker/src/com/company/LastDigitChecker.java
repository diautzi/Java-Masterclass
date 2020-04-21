package com.company;

public class LastDigitChecker {

    //write a method hasSameLastDigit with 3 params of type int
    //each number within the range 10-1000 inclusive
    //method should return true if at least 2 of the numbers share the same last digit
    //otherwise false;
    // then write a second method called isValid with one param of type int
    // the method need to return true if the param is in the range of 10-1000 inclusive
    //otherwise false;


    public static boolean hasSameLastDigit( int firstNumber, int secondNumber, int thirdNumber) {

        if ( isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)) {
            int firstNumberLastDigit = firstNumber %  10;
            int secondNumberLastDigit = secondNumber % 10;
            int thirdNumberLastDigit = thirdNumber % 10;

            return (( firstNumberLastDigit == secondNumberLastDigit ) || (firstNumberLastDigit == thirdNumberLastDigit) || (secondNumberLastDigit == thirdNumberLastDigit));
        }
        return false;
    }

    public static boolean isValid( int number) {
        if ( number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }

}
