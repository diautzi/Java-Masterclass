package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmail());

        VipCustomer person2 = new VipCustomer("Diana", 30000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmail());

        VipCustomer person3 = new VipCustomer("Diana", 2000.00, "dia@yahoo");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmail());
    }
}
