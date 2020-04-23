package com.company;


//2. write class Carpet with one instance varible names cost of type double
//class need one constructor with param cost and it needs to initialize the field
//getCost = > return the val of cost field

public class Carpet {
    private double cost;

    public Carpet( double cost) {
        if ( cost < 0 ){
            cost = 0;
        }
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }
}
