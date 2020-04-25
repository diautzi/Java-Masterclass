package com.company;

public class Person {

    private String fullName;

    // constructor - this is required, same parameter name as field
    public Person(String fullName) {
        this.fullName = fullName;
    }

    //setter - this is required, same parameter name as field
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    // getter method - this is optional
    public String getFullName() {
        return fullName;
    }
}
