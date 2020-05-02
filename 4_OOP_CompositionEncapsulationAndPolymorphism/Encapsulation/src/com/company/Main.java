package com.company;

public class Main {

    public static void main(String[] args) {

        //wrong example of encapsulation
//        Player player = new Player();
//        player.fullName = "Diana";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth( damage );
//        player.healthRemaining();
//        System.out.println("Remaining health is " + player.healthRemaining());
//        damage =11;
//        player.health = 200;
//        player.loseHealth( damage );
//        System.out.println("Remaining health is " + player.healthRemaining());

        // correct example of encapsulation
        EnhancePlayer enhancePlayer = new EnhancePlayer( "Diana", 200, "fire");
        System.out.println("Initial health is " + enhancePlayer.getHitPoint());
    }
}
