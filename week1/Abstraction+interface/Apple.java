//abstraction + interface combo 3
package com.demo;

interface Edible {
 void eat();
}

abstract class Fruit implements Edible {
 abstract void wash();
}

class Apple extends Fruit {
 
 @Override
 public void eat() {
     System.out.println("Eating the apple.");
 }
 
 @Override
 public void wash() {
     System.out.println("Washing the apple.");
 }
 public static void main(String[] args) {
	 Apple apple = new Apple();
     
     apple.wash();
     apple.eat();
}
}



