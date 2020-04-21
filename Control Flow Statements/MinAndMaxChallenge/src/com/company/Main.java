package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

//        int max = 0;
//        int min= 0
//        boolean first = true; // flag SO WE SET THE FIRST VAL OF MIN


        //////////// OR WE COULD USE CONSTANTS TO GET RID OF THE FLAG /////
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {

            System.out.println("Enter number:");
            boolean isValidNumber = scanner.hasNextInt();

            if(isValidNumber) {
                int input = scanner.nextInt();

//                if(first) {
//                    first = false;
//                    minNum = input;
//                    maxNum = input;
//                }
                if ( input > max) {
                    max = input;
                }
                if( input < min ){
                    min = input;
                }

            }else {
               break;
            }
            scanner.nextLine(); //handle input
        }
        System.out.println("min = " + min + ", maxNum = " + max);
        scanner.close();
    }
}
