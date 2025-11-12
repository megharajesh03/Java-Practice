package Day11;

public class ThreadDemo extends Thread {
	public static void main(String[] args) {
		ThreadDemo th1 = new ThreadDemo();	// Thread Object (New born)
		ThreadDemo th2 = new ThreadDemo(); 
		th1.start(); 						// Runnable
		th2.start();
		//th2.run();
		
	}
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000); 		//prints i with a 3 second gap
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
public class ThreadDemo extends Thread {
	public static void main(String[] args) {
		ThreadDemo th1 = new ThreadDemo();	// Thread Object (New born)
		ThreadDemo th2 = new ThreadDemo(); 
		th1.display(); 						// Runnable
		th2.display();
		
	}
	public void display() {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000); 		//prints i with a 3 second gap
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
*/

/*
public class ThreadDemo extends Thread {
	public static ThreadDemo th1;
	public static void main(String[] args) {
		th1 = new ThreadDemo();				// Thread Object (New born)
		th1.start(); 						// Runnable
		
	}
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			if (i==3) {
				th1.suspend();  // use Run as Java Application
			}
		}
	}
}
*/
