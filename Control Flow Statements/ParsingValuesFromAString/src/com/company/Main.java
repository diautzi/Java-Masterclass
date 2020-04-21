package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String numberAsString = "2020.123";
        System.out.println("numberAsString = " + numberAsString);

//        int number = Integer.parseInt(numberAsString);
//        System.out.println("Number = " + number);

        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println("NumberDouble = " + numberDouble);

        numberAsString += 1;
//        number += 1;
        numberDouble += 1;

        System.out.println("numberAsString = " + numberAsString); // => 20201 (concatenating one to the string)
//      System.out.println("Number = " + number);                 // => 2021
        System.out.println("NumberDouble = " + numberDouble);       // => 2021.123




    }
}
