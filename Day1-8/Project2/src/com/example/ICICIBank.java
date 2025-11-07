package com.example;

public class ICICIBank implements Loan {

	@Override
	public void interestRate(int amount) {
		int ir = 1000*3*amount;
		System.out.println(ir);
	}

}
