package com.example;

public class Monkey extends Tiger { //multi-lvl
	// if Monkey extends animal then Hierarchical
	void eat() {
		super.eat();
		System.out.println("Banaenae");
		
	}
	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.eat();
	}

}
