package com.company;

// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer = new Printer( 29, 300, false );
        System.out.println("Initial toner level is at " + printer.getTonerLevel() + "%");
        printer.addToner( 45 );
        System.out.println("Toner level for first printer after adding toner is at " + printer.getTonerLevel() + "%");
        System.out.println("Initial page count is " + printer.getNumberOfPrintedPages());
        System.out.println("Pages printed was " + printer.printPages(200 ) + " new total print count for printer is " + printer.getNumberOfPrintedPages() + ".");


        Printer mySecondPrinter = new Printer(55, 150, false);
        System.out.println("Initial toner level for second printer is at " + printer.getTonerLevel() + "%");
        printer.addToner( 45 );
        System.out.println("Toner level for second printer after adding toner  is at " + printer.getTonerLevel() + "%");
        System.out.println("Initial page count is " + mySecondPrinter.getNumberOfPrintedPages());
        System.out.println("Pages printed was " + mySecondPrinter.printPages(10 ) + " new total print count for printer is " + mySecondPrinter.getNumberOfPrintedPages() + ".");


    }
}
