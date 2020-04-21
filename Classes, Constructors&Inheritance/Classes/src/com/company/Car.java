package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    ////// setter method/////
    public void setModel( String model) {
        String validModel = model.toLowerCase();
        if ( validModel.equals("carrera") || validModel.equals("accord")) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }

    }


    //////getter method////////
    public String getModel() {
        return this.model;
    }

}
