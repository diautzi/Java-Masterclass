package com.company;

public class Wall {

    //write class Wall
    //two fields( instance variables) => width & height ( both double)
    //calss needs 2 constrictors
    // 1. does not have any params
    // 2. has params width & height of type double. in case width || height < => need to be set to 0
    // write getter setter for width & height
    // getArea(no params) => area of the wall


    private double width;
    private double height;


    //// 1.st constructor without params ///

    public Wall() {
        this(0.00, 0.00);
    }


    //// 2.nd constructor with params /////
    public Wall(double width, double height) {
        if ( width < 0 ) {
            width = 0;
        } if (height < 0 ) {
            height = 0;
        }
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if ( width < 0 ) {
            this.width = 0;
        }
        else {
            this.width = width;
        }

    }

    public void setHeight(double height) {
        if ( height >= 0) {
            this.height = height;
        }
        else {
            this.height = 0;
        }

    }

    public double getArea() {
        return this.width * this.height;
    }
}
