package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        class A {
            private void display()
            {
                System.out.println("GeeksforGeeks");
            }
        }

        class B {
            public static void main(String args[]) {
                A obj = new A();
                //trying to access private method of another class
                obj.display();
            }
        }
    }

}
