package com.company;

public class Person {
    //write a class Person
    // needs 3 fileds( instance variables) firstName, lastName of type String and age of type int
    //write the following methods( instance methods):
        //1.getFirstName => returns the value of firstName
        //2.getLastName => return the val of lastName
        //3.getAge => returns the val of age
        //4.setLastName(param String of lastName) => sets the val of lastName
        //5.setFirstName( param String of firstName) => sets the val of firstName
        //6.setAge( param int age > 0 && age < 100) => else set to 0;
        //7.isTeen(no params) => return true if age > 12 && age < 20
        //8.getFullName(no params) => returns full name of person:
            //a. case lastName empty string => return firstName
            //b. case firstName empty string => return lastName
            //use method isEmpty() from String class to check


    private String firstName;
    private String lastName;
    private int age;


    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age > 0 && age <= 100) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if( this.lastName.isEmpty() && this.firstName.isEmpty()){
            return "";
        }
        else if ( this.lastName.isEmpty()) {
            return this.firstName;
        }
        else if ( this.firstName.isEmpty()) {
            return this.lastName;
        }
        return this.firstName + " " + this.lastName;
    }

}
