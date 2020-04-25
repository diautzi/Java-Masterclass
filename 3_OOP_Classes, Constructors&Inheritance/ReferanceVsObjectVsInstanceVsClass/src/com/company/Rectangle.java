package com.company;


class Shape {
    // parent class ( super class)
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Rectangle extends Shape {
    private int width;
    private int height;

    // 1st constructor
    public Rectangle(int x, int y) {
     this(x, y, 0, 0); //calls the 3rd constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y); // calls constructor from parent(super class) Shape
        this.width = width;
        this.height = height;
    }
}







