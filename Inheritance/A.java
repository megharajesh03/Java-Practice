//inheritance3 : Single level
package com.demo;

class B {
	String name;

	public B(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("This is class B. Name: " + name);
	}
}

class A extends B {

	public A(String name) {
		super(name); 
	}

	public void greet() {
		System.out.println("Hello from class A! My name is " + name);
	}
	public static void main(String[] args) {
		A objA = new A("Eldin");
		
		objA.displayInfo(); 

		objA.greet(); 
	}
}

