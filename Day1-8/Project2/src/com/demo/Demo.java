package com.demo;

public class Demo {
	public static void main(String[] args) {
		Bird b = new Bird() {

			@Override
			public void eat() {
				System.out.println("Eat insect");
			}
/*
			@Override
			public void fly() {
				System.out.println("Flies fast");
			}*/
			
		};						//; is imp for making block (anonymous method)
		b.eat();
		//b.fly();
	}
}
