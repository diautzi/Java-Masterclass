package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car porsche = new Car();
        Car honda = new Car();

        porsche.setModel("911");
        honda.setModel("Accord");

        System.out.println("Model is " + honda.getModel());
    }
}
