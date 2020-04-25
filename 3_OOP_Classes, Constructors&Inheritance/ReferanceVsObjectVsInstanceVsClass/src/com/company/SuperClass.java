package com.company;


    class Animal {

         public void move() {
              System.out.println("Animal.move() called");
        }
    }

    class Dog extends Animal {
         //override method from parent class
         @Override
         public void move() {
             super.move();
             System.out.println("Dog.move() called");
        }
    }

    class MainClass {
        public static void main(String[] args){
            Dog dog = new Dog();
            dog.move();
        }
    }



