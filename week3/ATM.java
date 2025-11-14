//Exception Handling2
package week3;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class ATM {
	private double balance;

	public ATM(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException("Alert: Withdrawal amount exceeds available balance!");
		}
		balance -= amount;
		System.out.println("Withdrawal successful. Remaining balance: " + balance);
	}
	
	public static void main(String[] args) {
		ATM atm = new ATM(5000); 
		Scanner sc = new Scanner(System.in);
		double withdrawalAmount;
		System.out.println("Enter amount to withdraw :");
		withdrawalAmount = sc.nextDouble();
		
		try {
			atm.withdraw(withdrawalAmount);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
}

