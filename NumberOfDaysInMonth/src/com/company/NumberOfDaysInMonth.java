package com.company;

public class NumberOfDaysInMonth {

    //write a method isLeapYear with a param of type int named year
    //the param needs to be >= 1 and <=9999
    //if param not in range return false
    //if is in the valid range, calculate if it is leap year and return true, else false
    //leap year is divisible by 4 or 400, but not by 100


    public static boolean isLeapYear(int year) {

        if( year < 0 && year > 9999) {
            return false;
        } else {
            if( year >= 0 && year <=9999) {
                if ( year % 4 == 0 || year % 400 == 0  && year % 100 != 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year > 0 && year <= 9999)) {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
            }
        } else {
            return -1;
        }
        return month;
    }

}
