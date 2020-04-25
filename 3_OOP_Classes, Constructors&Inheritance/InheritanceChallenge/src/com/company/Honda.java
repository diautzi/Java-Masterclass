package com.company;

public class Honda extends Car {
    private int roadServiceMonths;

    public Honda(int roadServiceMonths) {
        super("Honda", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
