package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.

        Honda car1 = new Honda(12);
//        car1.changeGear(3);
//        car1.steer(12);
//        car1.getCurrentDirection();
        car1.steer(45);
        car1.accelerate(30);
        car1.accelerate(20);
        car1.accelerate(-42);
        
        }

}
