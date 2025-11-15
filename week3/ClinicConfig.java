//Static Level Synchronisation1
package week3;

import java.io.*;

public class ClinicConfig implements Serializable {

	// Static global configuration values
	public static String hospitalName;
	public static String location;

	// Static synchronized method
	public static synchronized void saveConfig() {
		System.out.println(Thread.currentThread().getName() + " is saving config...");

		File file = new File("ClinicConfig.dat");

		try (FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			// Create a temporary config object to serialize
			ClinicConfig configObj = new ClinicConfig();
			oos.writeObject(configObj);

			System.out.println(Thread.currentThread().getName() + " saved config successfully!");

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public static void main(String[] args) {

		// Initialize static data
		ClinicConfig.hospitalName = "City Care Hospital";
		ClinicConfig.location = "Downtown Avenue";

		// Thread 1 calling static synchronized method
		Thread t1 = new Thread(() -> {
			ClinicConfig.saveConfig();
		}, "T1");

		// Thread 2 calling static synchronized method
		Thread t2 = new Thread(() -> {
			ClinicConfig.saveConfig();
		}, "T2");

		// Start threads
		t1.start();
		t2.start();
	}
}

