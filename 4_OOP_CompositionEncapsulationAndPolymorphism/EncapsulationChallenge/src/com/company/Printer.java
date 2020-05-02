package com.company;
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.


public class Printer {

    private int tonerLevel = 100;
    private int numberOfPrintedPages = 0;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPrintedPages, boolean duplexPrinter) {

        if ( tonerLevel > 0 && tonerLevel <= 100 ) {
            this.tonerLevel = tonerLevel;
        }

        this.numberOfPrintedPages = numberOfPrintedPages;
        this.duplexPrinter = duplexPrinter;
    }

    public int addToner( int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                System.out.println("Toner full");
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if( this.duplexPrinter) {
            pagesToPrint = (pages /2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPrintedPages += pagesToPrint;
        return pagesToPrint;
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }
}
