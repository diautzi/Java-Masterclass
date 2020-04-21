package com.company;

public class GreatestCommonDivisor {

    // wtite a method named getTheGreatestCommonDivisor with 2 params of type int
    // named first and second
    //if one param is < 10, return -1
    //method should return the greatest divisor of thr 2 numbers

    public static int getGreatestCommonDivisor( int first, int second) {

        if ( first >= 10 && second >= 10 ) {
            int smallerNum = Math.min( first, second);
            for ( int i = smallerNum; i > 0; i--) {
                if( first % i == 0 && second % i == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
