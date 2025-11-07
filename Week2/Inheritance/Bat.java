//Inheritance1 : Hierarchical 
package com.demo;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Mammal is giving birth.");
    }
}

class Bird extends Animal {
    void layEggs() {
        System.out.println("Bird is laying eggs.");
    }

    void fly() {
        System.out.println("Bird is flying.");
    }
}

class Bat extends Mammal {
    @Override
    public void eat() {
        System.out.println("Bat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Bat is sleeping.");
    }

    @Override
    public void giveBirth() {
        System.out.println("Bat is giving birth.");
    }

    public void fly() {
        System.out.println("Bat is flying.");
    }

    public static void main(String[] args) {
        Bat bat = new Bat();

        bat.eat();        // from Animal
        bat.sleep();      // from Animal
        bat.giveBirth();  // from Mammal
        bat.fly();        // Bat specific method

        System.out.println("-----");

        Bird bird = new Bird();
        bird.eat();       // from Animal
        bird.sleep();     // from Animal
        bird.layEggs();   // from Bird
        bird.fly();       // from Bird
    }
}
