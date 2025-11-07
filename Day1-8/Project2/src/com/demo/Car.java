package com.demo;

public abstract class Car {
	final public void color() {
		System.out.println("Blue");
	}
	public static void breandName() {
		System.out.println("Porsche");
	}
	public abstract void start();
	public abstract void increaseSpeed();
	public abstract void stop();
}
