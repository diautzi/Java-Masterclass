package com.company;

public class SharedDigit {

    //write method hasSharedDigit with two params of type int
    //each should be within range of 10-99 inclusive
    //if not in range return false;
    //method should return true if the digit appears in both numbers
    //otherwise false;

    public static boolean hasSharedDigit( int firstNumber, int secondNumber) {
        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            firstNumber /= 10;
            secondNumber /= 10;
            int firstNumberFirstDigit = firstNumber;
            int secondNumberFirstDigit = secondNumber;

            return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberLastDigit) || (firstNumberLastDigit == secondNumberFirstDigit) || (firstNumberLastDigit == secondNumberLastDigit));
        }
        return false;
    }
}
