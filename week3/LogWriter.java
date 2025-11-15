//static method synchronization2

package week3;
import java.io.*;

class LogWriter {

	public static synchronized void writeLog(String msg) {
		System.out.println(Thread.currentThread().getName() + " attempting to write log...");

		File file = new File("log.txt");

		try (FileOutputStream fos = new FileOutputStream(file, true);  // append mode
				ObjectOutputStream oos = new AppendableObjectOutputStream(fos)) {

			oos.writeObject(msg);

			System.out.println(Thread.currentThread().getName() + " wrote log: " + msg);

		} catch (IOException e) {
			System.out.println("Error writing log: " + e.getMessage());
		}
	}
	public static void main(String[] args) {

		// Multiple LogWriter instances (to prove instance doesn't matter)
		LogWriter w1 = new LogWriter();
		LogWriter w2 = new LogWriter();

		Thread t1 = new Thread(() -> {
			w1.writeLog("System started successfully.");
		}, "T1");

		Thread t2 = new Thread(() -> {
			w2.writeLog("User logged in.");
		}, "T2");

		Thread t3 = new Thread(() -> {
			w1.writeLog("Backup initiated.");
		}, "T3");

		// Start threads
		t1.start();
		t2.start();
		t3.start();
	}
}

//Custom ObjectOutputStream to avoid writing stream header repeatedly
//class AppendableObjectOutputStream extends ObjectOutputStream {
// public AppendableObjectOutputStream(OutputStream out) throws IOException {
//     super(out);
// }
//
// @Override
// protected void writeStreamHeader() throws IOException {
//     // Prevents header from being written multiple times
//     reset();
// }
//}



