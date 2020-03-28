package com.company;

public class Main {

    public static void main(String[] args) {
      ///////////// plus operator /////////
        int result  = 1 + 2 ; // 1 + 2  = 3
        System.out.println("1 + 2 = " + result);
        int prevResult = result;
        System.out.println("Prev result = " + prevResult);


        /////////// minus operator ///////
        result = result - 1 ;
        System.out.println("3 - 1 = " + result);
        System.out.println("Prev result = " + prevResult);

        ///////// multiplication////////
        result = result * 10;
        System.out.println("2 * 10 = " + result);

        ///////division//////
        result = result / 5;
        System.out.println("20 / 5 = " + result);

        ///////remainder/////
        result = result % 3;
        System.out.println("4 % 3 = " + result);

    }
}
