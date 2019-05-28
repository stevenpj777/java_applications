package com.ObjectMaster;

public class HumanTest {
    public static void main(String[] args) {

        Human person1 = new Human();
        Human person2 = new Human();
        Human person3 = new Human();
        Wizard wizard1 = new Wizard();
        Ninja ninja1 = new Ninja();
        Samurai sam1 = new Samurai();

//
//        person1.displayHealth();
//        person1.attack(person2);
//        person1.displayHealth();
//        person2.displayHealth();
//        wizard1.heal(person3);
//        wizard1.heal(person3);
//
//        wizard1.fireball(person3);
//        person3.displayHealth();
//
//        person1.displayHealth();
//        ninja1.displayHealth();
//        ninja1.steal(person1);
//        person1.displayHealth();
//        ninja1.displayHealth();

        person1.displayHealth();
        ninja1.displayHealth();
        ninja1.steal(person1);
        person1.displayHealth();
        ninja1.displayHealth();
        sam1.deathBlow(person1);
        person1.displayHealth();


    }
}
