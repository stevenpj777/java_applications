package com.ObjectMaster;

public class Human {

    public int strength;
    public int stealth;
    public int intelligence;
    public int health;

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

     public int attack(Human target) {
       target.setHealth();
        return this.health;
    }


    public int setHealth() {
        this.health -= 10;
        return health;
    }


    public void displayHealth() {
        System.out.println(this.health);

    }
}
