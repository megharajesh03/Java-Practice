package com.demo;

public class Ex {
	public static void main(String[] args) {
		Bird b =()->{System.out.println("Eats Instects");};
		b.eat();
		b.run();
		Bird.fly();
	}
}
