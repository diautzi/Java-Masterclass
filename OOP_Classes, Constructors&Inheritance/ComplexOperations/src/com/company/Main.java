package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ComplexNumber one = new ComplexNumber(2.0, 2.0);
        ComplexNumber two = new ComplexNumber(1.0, 1.0);


        one.add(1,1);
        one.add(2,1);

        System.out.println("one.real " + one.getReal());
        System.out.println("one.imaginary " + one.getImaginary());


        one.subtract(two);
        System.out.println("After first subtrsction: one.real " + one.getReal());
        System.out.println("one.imaginary " + one.getImaginary());

        one.subtract(two);
        System.out.println("Second Subtraction: one.real " + one.getReal());
        System.out.println("one.imaginary " + one.getImaginary());

    }
}
