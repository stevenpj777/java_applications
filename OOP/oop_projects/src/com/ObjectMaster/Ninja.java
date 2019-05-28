package com.ObjectMaster;

public class Ninja extends Human {


    public Ninja() {

        this.stealth = 10;
    }


    public int steal(Human target) {

        target.health -= this.stealth;
        this.health += this.stealth;

        System.out.println("health is"  + health);
        return target.health;
    }





}

