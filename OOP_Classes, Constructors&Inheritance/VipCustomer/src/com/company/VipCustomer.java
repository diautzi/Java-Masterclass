package com.company;

public class VipCustomer {

    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed


    private String name;
    private double creditLimit;
    private String email;


   ///// 1. using constructor with all params //////
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    /// 2.  constructor with 2 params and default email ////////
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown");
    }


    ///  3. constructor with all defaulf values //////
    public VipCustomer() {
        this( "Default name", 50000.00, "Default Email");
    }

    ////// creating getter methods /////

    public String getName() {
        return  this.name;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }
    public String getEmail(){
        return this.email;
    }
}
