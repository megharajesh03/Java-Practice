//Collection3: HashSet
package com.demo;

import java.util.HashSet;

class FruitBasket {
    HashSet<String> fruits = new HashSet<>();

    public void addFruit(String fruit) {
        if (fruits.add(fruit)) {
            System.out.println(fruit + " added to the basket.");
        } else {
            System.out.println(fruit + " is already in the basket.");
        }
    }

    public void removeFruit(String fruit) {
        if (fruits.remove(fruit)) {
            System.out.println(fruit + " removed from the basket.");
        } else {
            System.out.println(fruit + " is not in the basket.");
        }
    }

    public void checkFruit(String fruit) {
        if (fruits.contains(fruit)) {
            System.out.println(fruit + " is in the basket.");
        } else {
            System.out.println(fruit + " is not in the basket.");
        }
    }

    public void displayFruits() {
        if (fruits.isEmpty()) {
            System.out.println("The basket is empty.");
        } else {
            System.out.println("Fruits in the basket: " + fruits);
        }
    }
    public static void main(String[] args) {
        FruitBasket basket = new FruitBasket();

        basket.addFruit("Apple");
        basket.addFruit("Banana");
        basket.addFruit("Orange");
        basket.addFruit("Apple"); // Trying to add a duplicate

        basket.displayFruits();

        basket.checkFruit("Banana");
        basket.checkFruit("Grapes");

        basket.removeFruit("Banana");
        basket.removeFruit("Grapes"); 

        basket.displayFruits();
    }
}

