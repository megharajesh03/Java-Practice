package com.example;

public class Tiger extends animal{
	void eat() {							//method overriding b/w super class and sub class
		super.eat(); //from super class
		System.out.println("Only non");
	}
	
	void run() {
		System.out.println("Runs Fast");
	}
	public static void main(String[] args) { //single level inheritance
		Tiger t = new Tiger();
		t.run();
		t.eat();
		System.out.println("Tiger has "+t.legs+" legs"); 
	}

}
