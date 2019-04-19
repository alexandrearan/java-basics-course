package com.course.java.basics.challenges.encapsulation;

public class Player {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public Player(String name, int health, String weapon) {

        this.name = name;
        if (health  >= 0 && health <= 100) {

            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth (int damage) {

        this.hitPoints -= damage;
        if (this.hitPoints <= 0){
            System.out.println(this.name  + " is dead");
        }
    }

    public int healthRemaining () {

        return this.hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }
}
