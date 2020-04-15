package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //create a method called isEvenNumber that takes a param of type int
        //its purpose is to determine if the argument passed to the method is an
        // even number or not
        //return true if even, else return false;

        System.out.println(isEvenNumber(13));
        System.out.println(isEvenNumber(12));

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while ( number <= finishNumber) {
            number ++;
            if( !isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is " + number);
            count ++;
            if ( count == 5 ){
                break;
            }
//            System.out.println("Even number is " + number);
        }
        System.out.println("Even numbers found = " + count);

    }

    public static boolean isEvenNumber( int number) {
        if ( number % 2 == 0) {
            return true;
        }
        return false;
    }
}
