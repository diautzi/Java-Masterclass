package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Yorkie", 5,8,2,1,4, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Fish", 1 , 1, 2 , 2);

        fish.move(5);
    }

}
