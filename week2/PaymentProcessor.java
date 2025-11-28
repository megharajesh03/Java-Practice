//Exception Handling1
package week3;

import java.util.Scanner;

class InvalidCardException extends Exception {
	public InvalidCardException(String message) {
		super(message);
	}
}

public class PaymentProcessor {

	public void processPayment(String cardNumber) throws InvalidCardException {
		if (cardNumber.length() < 16) {
			throw new InvalidCardException("Error: Invalid card number. Card must have at least 16 digits.");
		}
		System.out.println("Payment processed successfully!");
	}
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		Scanner sc = new Scanner(System.in);
		String cardNumber = "";
		System.out.println("Enter card number:");
		cardNumber = sc.nextLine();
		try {
			processor.processPayment(cardNumber);
		} catch (InvalidCardException e) {
			System.out.println(e.getMessage());
		}
	}
}

