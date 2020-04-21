package com.company;

public class DiagonalStar {

    //write method named printSquareStar with one param of type int = number
    // if number < 5 => print "Invalid Value"
    //method should print diagonals to generate a rectangular pattern composed of stars

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // a loop which prints a new line (a row)
            for (int row = 0; row < number; row++) {
                // a loop which prints * and a space
                for (int column = 0; column < number; column++) {

                    // row == 0 top
                    // (row == number - 1) bottom
                    // (column == number - 1) right
                    //  column == 0 left

                    if (row == 0 || (row == number - 1) || column == 0 || (column == number - 1) || (row == column) || ((column + 1) == number - (row + 1) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}