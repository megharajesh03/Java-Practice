package outer;

public class Bank {
	int amount=2000;
	void balance() {
		System.out.println("Account balance is "+amount);
	}
	void withdraw(int amount) {
		if(amount>this.amount) {
			System.out.println("Insufficient balance");
			return;
		}
		this.amount-=amount;
	}
	void deposit(int amount) {
		this.amount+=amount;
		System.out.println("Deposit sucessfull");
	}
	public static void main(String[] args) {
		Bank b1= new Bank();
		b1.balance();
		b1.withdraw(500);
		b1.balance();
		b1.deposit(1000);
		b1.balance();
		b1.withdraw(5000);
	}
}
