package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Diana", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

    }


    public static int calculateScore( String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    /////////overloading method//////////

    public static int calculateScore(int score) {
        System.out.println("Unamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player and no points");
        return 0;
    }

}
