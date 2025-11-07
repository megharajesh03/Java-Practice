package com.example;

public class Theatre1 implements MalayalamMovies{
	int totalPrice=0;

	@Override
	public void lokah() {
		int ticketPrice=150;
		totalPrice+=ticketPrice;
		System.out.println("Lokah Movie "+ticketPrice);
		
	}

	@Override
	public void drishyam() {
		int ticketPrice=120;
		totalPrice+=ticketPrice;
		System.out.println("Drishyam Movie "+ticketPrice);
		
	}
	public void total() {
		System.out.println("Total Ticket Price "+totalPrice);
	}
	
	
}
