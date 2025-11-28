//static method synchronization3

package week3;

import java.io.*;

public class HospitalStats implements Serializable {

	public static int patientCount = 0;   // static variable shared across all threads

	// Static synchronized method to serialize statistics
	public static synchronized void saveStats() {
		System.out.println(Thread.currentThread().getName() + " is saving stats...");

		File file = new File("HospitalStats.dat");

		try (FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			// Create a serializable object containing the latest stats
			HospitalStats stats = new HospitalStats();
			oos.writeObject(stats);

			System.out.println(Thread.currentThread().getName() + 
					" saved patientCount = " + patientCount);

		} catch (IOException e) {
			System.out.println("Error saving stats: " + e.getMessage());
		}
	}
	public static void main(String[] args) {

		// Creating multiple threads to update stats and serialize
		Runnable task = () -> {
			// Each thread increases patient count
			for (int i = 0; i < 3; i++) {
				synchronized (HospitalStats.class) {
					HospitalStats.patientCount++;
				}
				HospitalStats.saveStats();  // save after each increment
			}
		};

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");
		Thread t3 = new Thread(task, "Thread-3");

		// Start threads
		t1.start();
		t2.start();
		t3.start();
	}
}



