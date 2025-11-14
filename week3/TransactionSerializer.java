package week3;

import java.io.*;

class Account implements Serializable {
	private int accNo;
	private double balance;
	private String transactionType;

	public Account(int accNo, double balance, String transactionType) {
		this.accNo = accNo;
		this.balance = balance;
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "Account{accNo=" + accNo + 
				", balance=" + balance + 
				", transactionType='" + transactionType + "'}";
	}
}

class AppendableObjectOutputStream extends ObjectOutputStream {
	public AppendableObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		reset();  // Prevent writing header again
	}
}

class TransactionSerializer {

	private final File file;

	public TransactionSerializer(String fileName) {
		this.file = new File(fileName);
	}

	public synchronized void saveTransaction(Account a) {
		try (FileOutputStream fos = new FileOutputStream(file, true);
				ObjectOutputStream oos =
						file.length() == 0
						? new ObjectOutputStream(fos)                 // first time: write header
								: new AppendableObjectOutputStream(fos)) {    // after that: no header

			oos.writeObject(a);
			System.out.println(Thread.currentThread().getName() + 
					" saved transaction: " + a);

		} catch (IOException e) {
			System.out.println("Error saving transaction: " + e.getMessage());
		}
	}

	public static void main(String[] args) {

		TransactionSerializer serializer = new TransactionSerializer("transactions.dat");

		// Thread 1 for deposit transaction
		Thread t1 = new Thread(() -> {
			Account a1 = new Account(101, 5000, "Deposit");
			serializer.saveTransaction(a1);
		}, "Thread-1");

		// Thread 2 for withdrawal transaction
		Thread t2 = new Thread(() -> {
			Account a2 = new Account(101, 2000, "Withdrawal");
			serializer.saveTransaction(a2);
		}, "Thread-2");

		t1.start();
		t2.start();
	}
}


