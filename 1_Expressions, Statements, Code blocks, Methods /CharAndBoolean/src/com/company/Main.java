package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("My char is : " + myChar);
        System.out.println("My unicode char is : " + myUnicodeChar);
//
        char copyrightChar = '\u00A9';
        System.out.println(copyrightChar);

        boolean myTrueBooleanVal = true;
        boolean myFalseBooleanVal = false;
        System.out.println("My true boolean is : " + myTrueBooleanVal);
        System.out.println("My false boolean is : " + myFalseBooleanVal);

        boolean isCustomerOver21 = true;
    }
}
