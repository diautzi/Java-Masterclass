package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NumberToWords.numberToWords(234);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);

        System.out.println(NumberToWords.reverse(234));
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(100));

        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(5200));
    }
}
