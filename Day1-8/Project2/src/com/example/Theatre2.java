package com.example;

public class Theatre2 implements TamilMovies {
	int totalPrice=0;
	@Override
	public void pokiri() {
		int ticketPrice=120;
		totalPrice+=ticketPrice;
		System.out.println("Pokiri Movie "+ticketPrice);
	}

	@Override
	public void leo() {
		int ticketPrice=130;
		totalPrice+=ticketPrice;
		System.out.println("Leo Movie "+ticketPrice);
	}

	
	
}
