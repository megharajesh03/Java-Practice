//Object level synchronization1
package week3;

import java.io.*;

public class Doctor implements Serializable {
	private String name;
	private String specialization;

	public Doctor(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Doctor{Name='" + name + "', Specialization='" + specialization + "'}";
	}

	// Object-level synchronized method
	public synchronized void serializeDoctor(String fileName) {
		File file = new File(fileName);

		try (FileOutputStream fos = new FileOutputStream(file, true);
				ObjectOutputStream oos = (file.length() == 0)
						? new ObjectOutputStream(fos)
								: new AppendableObjectOutputStream(fos)) {

			oos.writeObject(this);
			System.out.println(Thread.currentThread().getName() +
					" serialized: " + this);

		} catch (IOException e) {
			System.out.println("Error serializing doctor: " + e.getMessage());
		}
	}
	public static void main(String[] args) {

		Doctor d1 = new Doctor("Dr. Smith", "Cardiology");
		Doctor d2 = new Doctor("Dr. Brown", "Neurology");

		// These two threads use DOCTOR OBJECT 1 → will block each other
		Thread t1 = new Thread(() -> d1.serializeDoctor("doctor1.dat"), "T1");
		Thread t2 = new Thread(() -> d1.serializeDoctor("doctor1.dat"), "T2");

		// These two threads use DOCTOR OBJECT 2 → run parallel independently
		Thread t3 = new Thread(() -> d2.serializeDoctor("doctor2.dat"), "T3");
		Thread t4 = new Thread(() -> d2.serializeDoctor("doctor2.dat"), "T4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
//
//class AppendableObjectOutputStream extends ObjectOutputStream {
//	public AppendableObjectOutputStream(OutputStream out) throws IOException {
//		super(out);
//	}
//
//	@Override
//	protected void writeStreamHeader() throws IOException {
//		reset();   // avoid header corruption
//	}



