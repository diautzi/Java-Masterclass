package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        ////// initializing an empty constructor)

        BankAccount bankAccount = new BankAccount();
        System.out.println("Your default bank account: " + bankAccount.getAccountNumber());


        //// initializing a constructor with params////////

        BankAccount diaAccount = new BankAccount("123", 200.00, "Diana Utan", "dia@yahoo", "123-345-678");
        // "123-456-789");
        System.out.println(diaAccount.getAccountNumber());
        System.out.println(diaAccount.getBalance());

        diaAccount.withrawal(100.0);
        diaAccount.getAccountNumber();
        diaAccount.getEmail();
        diaAccount.getCustomerName();
        diaAccount.deposit(50.0);
        diaAccount.withrawal(100.0);
        diaAccount.deposit(51.0);
        diaAccount.withrawal(100.0);
        diaAccount.setCustomerName("Dia");
        diaAccount.getCustomerName();
    }
}
