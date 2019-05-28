package com.ObjectMaster;

public class Samurai extends Human {

//    private static int count = 0;
//    static int noOfObjects = 0;

    public Samurai() {
        this.health = 200;
//        count += 1;
//        noOfObjects += 1;
    }

    public void deathBlow(Human target) {
        this.health -= (this.health / 2);
        target.health = 0;
    }

    public void meditate() {
        this.health += (this.health / 2);
    }

    public void howMany() {
//        System.out.println("There are " + noOfObjects + " samurai");
    }


}


