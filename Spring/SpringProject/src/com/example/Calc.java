package com.example;

public class Calc {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void add() {
		System.out.println("The addition of "+x+" and "+y+" is "+(x+y));
		
	}
}
