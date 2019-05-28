package com.zookeeper;

public class Bat extends Mammal {

    int energy = 300;
    public void fly() {
        this.energy -= 50;
        System.out.println("Fly sound goes here");
        System.out.println(("Energy level is now: " + energy));
    }

    public void eatHumans() {
        this.energy += 25;
        System.out.println("You ate a human!  Energy level is now: " + energy);
    }

    public void attackTown() {
        this.energy -= 100;
        System.out.println("You attacked a town and energy is now: " + energy);
    }

}

