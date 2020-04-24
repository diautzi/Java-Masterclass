package com.company;

public class Fish  extends Animal{
    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.eyes = eyes;
    }

    private void rest() {

    }

    private void moveMuscles() {
        System.out.println("Move muscles was called");
    }

    private void moveFin() {
        System.out.println("Move Fin was called");
    }

    private void swim(int speed) {
        moveMuscles();
        moveFin();
        super.move(speed);
    }

    @Override
    public void move(int speed) {
      swim(speed);
    }
}
