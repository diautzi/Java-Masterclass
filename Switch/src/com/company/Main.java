package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int switchValue = 7;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4:case 5:case 6:
                System.out.println("Value was 4 or 5 or 6 ");
                System.out.println("Actually was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4, 5, 6");
                break;
        }

        //////////// challenge switch statement /////
        // create a new switch stattement using char
        //create a new char variable
        //create a switch statement testing for
        //A, B, C, D OR E
        //display a message if any of this were found
        //add a default display message saying not found

        char newVal = 'T';

        switch(newVal) {
            case 'A':
                System.out.println("Char found was A");
                break;
            case 'B':
                System.out.println("Char founnd was B");
                break;
            case 'C':
                System.out.println("Char founnd was C");
                break;
            case 'D': case 'E':
                System.out.println(newVal + " was found");
            default:
                System.out.println("None of the chars A, B, C, D or E found");
                break;

        }
    }
}
