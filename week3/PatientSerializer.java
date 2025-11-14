package week3;

import java.io.*;

class Patient implements Serializable {
	private String name;
	private int age;
	private String disease;

	public Patient(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient{name='" + name + "', age=" + age + ", disease='" + disease + "'}";
	}
}

class AppendingObjectOutputStream extends ObjectOutputStream {
	public AppendingObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}
	@Override
	protected void writeStreamHeader() throws IOException {
		// Do nothing → prevents header corruption
		reset();
	}
}

public class PatientSerializer {

	private final File file;

	public PatientSerializer(String fileName) {
		this.file = new File(fileName);
	}

	// Method-level synchronization
	public synchronized void savePatient(Patient patient) {

		try (FileOutputStream fos = new FileOutputStream(file, true);
				ObjectOutputStream oos = file.length() == 0
						? new ObjectOutputStream(fos)                  
								: new AppendingObjectOutputStream(fos)) {

			oos.writeObject(patient);
			System.out.println(Thread.currentThread().getName() + " saved: " + patient);

		} catch (IOException e) {
			System.out.println("Error while saving patient: " + e.getMessage());
		}
	}
	public static void main(String[] args) {

		PatientSerializer serializer = new PatientSerializer("patients.dat");

		Thread t1 = new Thread(() -> {
			serializer.savePatient(new Patient("Alice", 30, "Flu"));
		}, "Thread-1");

		Thread t2 = new Thread(() -> {
			serializer.savePatient(new Patient("Bob", 45, "Diabetes"));
		}, "Thread-2");

		Thread t3 = new Thread(() -> {
			serializer.savePatient(new Patient("Charlie", 55, "Heart Disease"));
		}, "Thread-3");

		t1.start();
		t2.start();
		t3.start();
	}
}



