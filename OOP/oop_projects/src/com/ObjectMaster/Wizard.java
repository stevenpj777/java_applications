package com.ObjectMaster;

public class Wizard extends Human {

    public Wizard() {
        int health = 50;
        int intelligence = 8;
    }

    public int heal(Human target) {
        target.health += this.intelligence;
        return health;
    }

    public int fireball(Human target) {
        target.health -= this.intelligence * 3;
        return this.health;
    }





}
