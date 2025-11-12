package Day11;

//inter-thread communication
public class Customer {
	int amount=2000;
	public synchronized void withdraw(int amount) {
		if(this.amount>=amount)	{
			System.out.println("Amount withdrawn successfully "+amount);
		}
		else {
			System.out.println("Insufficient account balance ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Withdraw process is continuing....");
	}
	public synchronized void deposit(int amount) {
		this.amount+=amount;
		System.out.println("Amount deposited successfully "+amount);
		notify();
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		new Thread() {
			public void run() {
				c.withdraw(4000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}