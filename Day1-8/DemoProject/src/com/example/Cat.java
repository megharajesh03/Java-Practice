package com.example;
/*
public class Cat {
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c);	//memory address of the object
		System.out.println(c.toString()); //same
	}
}
*/

public class Cat {
	
@Override
	public String toString() {		//
		return "Cat Object";
	}

	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c);
	}
}