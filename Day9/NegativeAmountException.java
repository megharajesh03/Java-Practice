package Day9;

public class NegativeAmountException extends Exception {
	int amount;
	
	public NegativeAmountException(int amount) {
		this.amount=amount;
	}

	@Override
	public String toString() {
		return "NegativeAmountException [amount=" + amount + "]";
	}
	
}

