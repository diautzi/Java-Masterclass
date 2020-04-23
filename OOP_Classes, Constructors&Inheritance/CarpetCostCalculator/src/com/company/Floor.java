package com.company;

//1. write class Floor with 2 instance variables width and length of type double
//if length < 0 => set to 0
//if width < 0 => set to 0;
//getArea => return area


public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
        this.width = width;
        this.length = length;
    }


    public double getArea() {
        return (this.width * this.length);
    }
}
