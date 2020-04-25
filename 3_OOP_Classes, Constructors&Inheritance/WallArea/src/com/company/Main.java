package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Wall wall = new Wall(5,4);

        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
//        wall.setWidth(-1.0);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());


        Wall wall2 = new Wall(1.125, -1.0);
        System.out.println(wall2.getWidth());
        System.out.println(wall2.getHeight());

    }
}
