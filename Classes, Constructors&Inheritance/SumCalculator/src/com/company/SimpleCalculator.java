package com.company;

public class SimpleCalculator {

    //write a class with the name SimpleCalculator
    //class needs 2 fields( instance variables) firstNumber and secondNumber both type double
    //wrrite the following methods:
    //getFirstNumber without params => return the value of firstNumber
    //getSecondNumber without params => return val of second number;
    //setFirstNumber => sets val of first num
    //setSecondNumber => sets the val of second num
    //getAdditionResult => returns the result of adding first and second numbers
    //getSubtractionResult => returns the result of substracting the val of second num from first number
    //getMultiplicationResult => reuslt of multiplying the 2 nums
    //getDivisionResult => result of dividing first by second num

    public double firstNumber;
    public double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber( double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber( double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        return this.firstNumber / this.secondNumber;
    }

}

