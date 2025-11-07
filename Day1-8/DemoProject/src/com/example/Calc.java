package com.example;

public class Calc {
static void add(int x, int y) {
	int z=x+y;
	System.out.println("The addition is "+z);
}
static int cube(int x) {
	return(x*x*x);
}
public static void main(String[] args) {
	Calc.add(22, 33);
	System.out.println(Calc.cube(5));
}
}
