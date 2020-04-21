package com.company;

public class NumberOfDaysInMonth {

    //write a method isLeapYear with a param of type int named year
    //the param needs to be >= 1 and <=9999
    //if param not in range return false
    //if is in the valid range, calculate if it is leap year and return true, else false
    //leap year is divisible by 4 or 400, but not by 100


    public static boolean isLeapYear(int year) {
        if (year > 0 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year > 0 && year <= 9999)) {
            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        System.out.println("February has 29 days in " + year + " because it is a leap year.");
                        return 29;
                    } else {
                        System.out.println("February has 28 days in " + year + " because it is NOT a leap year");
                        return 28;
                    }
                case 1:
                    System.out.println("January has 31 days.");
                    return 31;
                case 3:
                    System.out.println("March has 31 days.");
                    return 31;
                case 5:
                    System.out.println("May has 31 days.");
                    return 31;
                case 7:
                    System.out.println("July has 31 days.");
                    return 31;
                case 8:
                    System.out.println("August has 31 days.");
                    return 31;
                case 10:
                    System.out.println("October has 31 days.");
                    return 31;
                case 12:
                    System.out.println("December has 31 days.");
                    return 31;
                case 4:
                    System.out.println("April has 30 days.");
                    return 30;
                case 6:
                    System.out.println("June has 30 days.");
                    return 30;
                case 9:
                    System.out.println("September has 30 days.");
                    return 30;
                case 11:
                    System.out.println("November has 30 days.");
                    return 30;
            }
        } else {
            System.out.println("Invalid input.");
            return -1;
        }
        return month;
    }

}
