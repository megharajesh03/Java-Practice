//Collection1: ArrayList
package com.demo;

import java.util.ArrayList;

class Vegetable {
    String name;
    String color;

    public Vegetable(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display() {
        System.out.println(name + " (" + color + ")");
    }
    public static void main(String[] args) {
        ArrayList<Vegetable> vegetables = new ArrayList<>();

        vegetables.add(new Vegetable("Carrot", "Orange"));
        vegetables.add(new Vegetable("Broccoli", "Green"));
        vegetables.add(new Vegetable("Potato", "Brown"));

        vegetables.forEach(Vegetable::display);
        
        vegetables.remove(1); // Removing a vegetable (Broccoli)

        System.out.println("\nAfter removal:");
        vegetables.forEach(Vegetable::display);

        vegetables.add(new Vegetable("Spinach", "Green"));

        System.out.println("\nAfter adding Spinach:");
        vegetables.forEach(Vegetable::display);
    }
}



