package Day11;

public class Demo implements Runnable {
	public static void main(String[] args) {
		Demo rn = new Demo();
		Thread th1 = new Thread(rn);
		th1.start();
		Thread th2 = new Thread(rn);
		th2.start();
	}
	public void run() {
		System.out.println("Runnable object");
	}

}
