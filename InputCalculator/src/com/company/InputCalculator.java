package com.company;

import java.util.Scanner;

public class InputCalculator {

    // write a method called inputThenPrintSumAndAverage - no params
    //needs to read int numbers from the keybord
    //print message => "SUM = XX AVG= YY"
    //XX sum of all entered numbers of type int
    //YY represents average of all numbers of type long


    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while(true) {
            System.out.println("Enter your numbers: ");

            boolean isInt = scanner.hasNextInt();

            if ( isInt){
                int input = scanner.nextInt();
                count++;
                sum += input;
                average =  Math.round(sum /  count);
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
