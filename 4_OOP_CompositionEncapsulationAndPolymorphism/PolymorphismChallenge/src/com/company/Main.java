package com.company;

// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).
class Car {
    private String name;
    private boolean engine ;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
       return "Engine started in the Car class";
    }

    public String  accelerate() {
       return "Accelerate Car class";
    }

    public String  brake() {
        return "Brake Car class";
    }
}

class Honda extends Car {
    public Honda() {
        super("Honda", 3000);
    }

    @Override
    public String startEngine() {
        return "Honda has the most reliable engine";
    }

    @Override
    public String accelerate() {
        return "Honda accelerates to 60/mph in 6 seconds";
    }

    @Override
    public String brake() {
        return "Honda breaks to 0/mph in 3 seconds";
    }
}

class Toyota extends Car{
    public Toyota() {
        super("Toyota", 2900);
    }

    @Override
    public String startEngine() {
        return "Toyota is Honda's number one competitor regarding the best engine";
    }

    @Override
    public String accelerate() {
        return "Toyota accelerates to 60/mph in 6 seconds";
    }

    @Override
    public String brake() {
        return "Toyota breaks to 0/mph in 3 seconds";
    }
}

class Subaru extends Car {
    public Subaru() {
        super( "Subaru", 3100);
    }

    @Override
    public String startEngine() {
        return "Subaru is the best 4X4 car";
    }

    @Override
    public String accelerate() {
        return "Subaru accelerates to 60/mph in 6 seconds";
    }

    @Override
    public String brake() {
        return "Subaru breaks to 0/mph in 3 seconds";
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car = new Car("Volvo", 2500 );
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());

        Honda honda = new Honda();
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
        System.out.println(honda.startEngine());

        Toyota toyota = new Toyota();
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());
        System.out.println(toyota.startEngine());

        Subaru subaru = new Subaru();
        System.out.println(subaru.accelerate());
        System.out.println(subaru.brake());
        System.out.println(subaru.startEngine());
    }
}
