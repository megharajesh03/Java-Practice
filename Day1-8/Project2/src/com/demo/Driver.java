package com.demo;

public class Driver extends Car{
	
	@Override
	public void start() {
		System.out.println("Car started");
		
	}

	@Override
	public void increaseSpeed() {
		System.out.println("speed increased");
		
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public static void main(String[] args) {
		Driver d = new Driver();
		d.color();
		d.breandName();
		d.start();
		d.increaseSpeed();
		d.stop();
	}
}
