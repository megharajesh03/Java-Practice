package com.example;

public class Bank {
static int amount=2000; //static makes the changes global
public static void main(String[] args) {
	Bank b1= new Bank();
	Bank b2= new Bank();
	b1.amount+=5000;
	System.out.println("First Object "+b1.amount);
	System.out.println("Second Object "+b2.amount);
	System.out.println("Class level "+Bank.amount);
}
}
