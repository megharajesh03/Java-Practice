package com.example;

public class SBIBank implements Loan {

	@Override
	public void interestRate(int amount) {
		int ir = 1000*2*amount;
		System.out.println(ir);
	}

}
