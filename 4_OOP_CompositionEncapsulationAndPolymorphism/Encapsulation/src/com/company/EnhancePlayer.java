package com.company;

public class EnhancePlayer {

    private String name;
    private int hitPoint = 100;
    private String weapon;

    public EnhancePlayer(String name, int hitPoint, String weapon) {
        this.name = name;

        if( hitPoint >0 && hitPoint <= 100 ) {
            this.hitPoint = hitPoint;

        }

        this.weapon = weapon;
    }

    public void loseHealth( int damage) {
        this.hitPoint = this.hitPoint - damage;
        if( this.hitPoint < 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHitPoint() {
        return hitPoint;
    }
}
