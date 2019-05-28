package com.zookeeper;

public class Gorilla extends Mammal {

        public void throwSomething() {
            this.energy -= 5;
            System.out.println("You have thrown something");
            System.out.println(("Energy level is now: " + energy));
        }

        public void eatBananas() {
            this.energy += 10;
            System.out.println("The gorilla is sated with engery level" + energy);
        }

        public void climb() {
            this.energy -= 10;
            System.out.println("Climbed a tree and energy is now; " + energy);
        }

}
