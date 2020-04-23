package com.company;

//3. write class Calculator with 2 instance variables floor tyoe Floor and carpet type Carpet
// constructor initialized with this 2 params
//getTotalCost => return the calculated total to cover the floor with carpet


public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }

}
