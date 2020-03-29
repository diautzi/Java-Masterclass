package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver =  true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if ( score < 5000 && score > 1000) {
            System.out.println("Your score was  less 5000 and greater then 1000");
        } else if(score < 1000) {
            System.out.println("Your score was less then 1000");
        }
        else {
            System.out.println("You got here");
        }

        if(gameOver){ //shortcut for gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was : " + finalScore);
        }

        //////////challenge ///////
        boolean secondGameOver =  true;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if (gameOver) {
            int finalScore = secondScore + secondLevelCompleted * secondBonus;
            System.out.println("Your second score was: " + finalScore);
        }

    }
}
