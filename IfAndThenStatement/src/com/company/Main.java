package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if ( isAlien == false ) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if ( topScore < 100 ) {
            System.out.println("You got the high score");
        }

        ///////// && (AND) operator
        int secondHighScore = 95;
        if ((topScore > secondHighScore) && (topScore < 100))
            System.out.println("Greater then second top score and less then 100");

        ////////// || (OR) Operator

        if (( topScore > 90) || (secondHighScore <= 90 )) {
            System.out.println("Either or both conditions are true");
        }

        int newVal = 50;
        if ((newVal == 50)) {
            System.out.println("This evaluates to true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happend!");
        }

        ///////Ternary operator///////
        isCar =  true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("was car is true");
        }

        /////Operator Challenge////
        double firstVal = 20.00;
        double secondVal = 80.00;

        double total = (firstVal + secondVal)  * 100;
        double remainder = total % 40.00;
        System.out.println("remainder is " + remainder);

        boolean isNoRemainder = remainder == 0 ? true : false;
        System.out.println("isNoRemainder evaluates to : " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
