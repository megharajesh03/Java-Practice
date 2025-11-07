package com.example;

class A{
	A(){ //either default or no constructor
		System.out.println("A Class Default Constructor");
	}
	A(int x){
		System.out.println("x is "+x);
	}

}

public class B extends A {
	B(){
		super(5);
		System.out.println("B Class Constructor");
	}
	B(int x){
		super(x);
		System.out.println("B class x is "+x);
	}
	public static void main(String[] args) {
		new B(22);
	}
}