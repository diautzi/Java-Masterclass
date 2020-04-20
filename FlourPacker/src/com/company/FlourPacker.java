package com.company;

public class FlourPacker {

    //write a method named canPack with 3 params of type int: bigCount, smallCount and goal
    //bigCpunt = 5kgs bags
    //small count = 1kg bag
    //goal = the agoal ammount of floue to assemble a package
    // the sum of bigCount and smallCount must be at least equal to our goal => return true


    public static boolean canPack( int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        else if ( smallCount  + (bigCount * 5 ) < goal ) {
            return false;
        }
        else if ( goal % 5 > smallCount){
            return false;
        }
        return true;
    }

}
