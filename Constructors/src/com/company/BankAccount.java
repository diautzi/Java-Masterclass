package com.company;

import java.sql.Struct;

public class BankAccount {
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    // Create getters and setters for each field
    // Create two additional methods:
         // 1. To allow the customer to deposit funds (this should increment the balance field).
         // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.



    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email,
                   String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        System.out.println("Your account number is " + this.accountNumber);
        return this.accountNumber;
    }

    public void setAccountNumber( String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        System.out.println("Balance is " + this.balance);
        return this.balance;
    }

    public void setBalance( double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        System.out.println("Customer name is " + this.customerName);
        return this.customerName;
    }

    public void setCustomerName( String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        System.out.println("Email is " + this.email);
        return this.email;
    }

    public void setEmail( String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        System.out.println("Phone nr is " + this.phoneNumber);
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit( double ammount) {
        this.balance += ammount;
        System.out.println("Balance after deposit is " + this.balance);
    }

    public void withrawal(double ammount) {
        if ( this.balance >= ammount ) {
            this.balance -= ammount;
            System.out.println("Balance after withrawal is " + this.balance);
        }
        else {
            System.out.println("Insufficient funds in your bank account!");
        }
    }

}
