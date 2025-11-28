//Object Level Synchronization2

package week3;

import java.io.*;

class Data implements Serializable {
	private String message;
	public Data(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Data{message='" + message + "'}";
	}
}

//To avoid duplicate headers when appending serialized objects
//class AppendableObjectOutputStream extends ObjectOutputStream {
//	public AppendableObjectOutputStream(OutputStream out) throws IOException {
//		super(out);
//	}
//	@Override
//	protected void writeStreamHeader() throws IOException {
//		reset();
//	}
//}

//FileExporter using a custom lock for synchronization
public class FileExplorer {

	private final Object lock = new Object();  // custom lock object

	public void exportToFile(String fileName, Data data) {
		synchronized (lock) {  // synchronization using custom lock
			File file = new File(fileName);

			try (FileOutputStream fos = new FileOutputStream(file, true);
					ObjectOutputStream oos =
							(file.length() == 0)
							? new ObjectOutputStream(fos)
									: new AppendableObjectOutputStream(fos)) {

				oos.writeObject(data);
				System.out.println(Thread.currentThread().getName() +
						" exported: " + data + " → " + fileName);

			} catch (IOException e) {
				System.out.println("Error exporting: " + e.getMessage());
			}
		}
	}
	public static void main(String[] args) {

		FileExplorer exporter1 = new FileExplorer();  // For file A
		FileExplorer exporter2 = new FileExplorer();  // For file B

		// Threads writing to SAME FILE → must block each other
		Thread t1 = new Thread(() ->
		exporter1.exportToFile("fileA.dat", new Data("A1")), "T1");

		Thread t2 = new Thread(() ->
		exporter1.exportToFile("fileA.dat", new Data("A2")), "T2");

		// Threads writing to DIFFERENT FILE → run concurrently
		Thread t3 = new Thread(() ->
		exporter2.exportToFile("fileB.dat", new Data("B1")), "T3");

		Thread t4 = new Thread(() ->
		exporter2.exportToFile("fileB.dat", new Data("B2")), "T4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}



