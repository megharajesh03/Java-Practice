package com.example;

class C extends B{
	C(){
		System.out.println("Class C Default Constructor");
	}
}

public class D extends C {
	D(){
		System.out.println("Class D Default Constructor");
		
	}
	public static void main(String[] args) {
		new D();
	}
}
