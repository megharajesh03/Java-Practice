//abstraction + interface combo
package com.demo;

interface Moveable {
    void move();
}

abstract class Vehicle implements Moveable {
    int speed;
    public Vehicle(int speed) {
        this.speed = speed;
    }
    public void stop() {
        System.out.println("The vehicle has stopped.");
    }
}

public class Car extends Vehicle {
    public Car(int speed) {
        super(speed); 
    }

    @Override
    public void move() {
        System.out.println("The car is moving at " + speed + " km/h.");
    }

    public static void main(String[] args) {
        Car myCar = new Car(120);
        myCar.move();
        myCar.stop();
    }
}
