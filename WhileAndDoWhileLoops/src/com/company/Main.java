package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ////////// while /////////

        int count  = 6;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count ++;
        }
//
///////////////// or same like while (true) ///////////////////

        while(true) {
            if( count == 5) {
                break;
            }
            System.out.println("Count is " + count);
            count ++;
        }

        ///////////// do while /////////
        int count = 6;
        do {
            System.out.println("Count value wa " + count);
            count ++;

            if ( count > 100) {
                break;
            }
        } while ( count != 6);
    }
}
