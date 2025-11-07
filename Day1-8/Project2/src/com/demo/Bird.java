package com.demo;

public interface Bird {
	public void eat();
	//public void fly();
	public static void fly() {
		System.out.println("flies fast");
	}
	public default void run() {
		System.out.println("Runs slow");
	}
	public static void main(String[] args) {
		Bird.fly();
		Monkey m = new Monkey();
		m.eat();
	}
}
