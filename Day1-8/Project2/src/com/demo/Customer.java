package com.demo;

interface VegFood {
	public void meals();
	public void vegBiriyani();
	
}
interface NonVegFood{
	public void chickenBiriyani();
	public void muttonBiriyani();
}

class Hotel implements VegFood, NonVegFood {
	int totalPrice=0;
	@Override
	public void meals() {
		int cost=100;
		totalPrice+=cost;
		System.out.println("Meals :"+cost);
		
	}

	@Override
	public void vegBiriyani() {
		int cost=120;
		totalPrice+=cost;
		System.out.println("Veg Biriyani :"+cost);
		
	}

	@Override
	public void chickenBiriyani() {
		int cost=130;
		totalPrice+=cost;
		System.out.println("Chicken Biriyani :"+cost);
		
	}

	@Override
	public void muttonBiriyani() {
		int cost=150;
		totalPrice+=cost;
		System.out.println("Mutton Biriyani :"+cost);
		
	}
	public void billDeatils() {
		System.out.println("Total amount :"+totalPrice);
	}
	
}

public class Customer extends Hotel{
	public void displayInfo() {
		System.out.println("Customer Info");
	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.chickenBiriyani();
		c.muttonBiriyani();
		c.billDeatils();
		c.meals();
		c.vegBiriyani();
		c.billDeatils();
	}
}
