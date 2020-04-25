package com.company;

public class Point {

    //write class Point
    //class has 2 instance variables => x, y of type int
    //class needs 2 constructors
    //1. doesn't have params
    //2. with x & y as params
    //write the following instance methods:
    //getter & setter for x and y => return distance between this Poitn and Point(0, 0) as double
    //distance without params
    //distance with 2 params, type int  +> return distance between this Point and Point(x, y) as doubles
    //distance with param another Point => return distance between this Point and another Point as double



    private int x;
    private int y;

    /// 1st constructors with  no params //
    public Point() {
        this(0, 0);
    }

    ////2nd constructor with params ////
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    ////// instance methods/////

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(){
        return distance(0,0);
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
}
