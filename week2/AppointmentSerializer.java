//Method Level Synchronization3
package week3;

import java.io.*;

class Appointment implements Serializable {
	private String doctorName;
	private String patientName;
	private String date;
	private String time;

	public Appointment(String doctorName, String patientName, String date, String time) {
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.date = date;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Appointment{Doctor='" + doctorName + "', Patient='" + patientName +
				"', Date='" + date + "', Time='" + time + "'}";
	}
}

//A custom ObjectOutputStream to avoid writing header twice

//class AppendableObjectOutputStream extends ObjectOutputStream {
//	public AppendableObjectOutputStream(OutputStream out) throws IOException {
//		super(out);
//	}
//	@Override
//	protected void writeStreamHeader() throws IOException {
//		reset();   // Prevents duplicate stream header
//	}
//}						already defined in week3

//Serializer class with synchronized method
class AppointmentSerializer {

	private final File file;

	public AppointmentSerializer(String filename) {
		this.file = new File(filename);
	}

	// Synchronization ensures only ONE thread writes at a time
	public synchronized void saveAppointment(Appointment a) {
		try (FileOutputStream fos = new FileOutputStream(file, true);
				ObjectOutputStream oos =
						(file.length() == 0) ?
								new ObjectOutputStream(fos) :      // Write header first time
									new AppendableObjectOutputStream(fos)) { // Append mode

			oos.writeObject(a);
			System.out.println(Thread.currentThread().getName() +
					" booked appointment: " + a);

		} catch (IOException e) {
			System.out.println("Error writing appointment: " + e.getMessage());
		}
	}
	public static void main(String[] args) {

		AppointmentSerializer serializer =
				new AppointmentSerializer("appointments.dat");

		// Thread 1 → booking appointment
		Thread t1 = new Thread(() -> {
			Appointment ap1 = new Appointment(
					"Dr. Smith", "Alice", "12-02-2025", "10:00 AM");
			serializer.saveAppointment(ap1);
		}, "Thread-1");

		// Thread 2 → booking another appointment
		Thread t2 = new Thread(() -> {
			Appointment ap2 = new Appointment(
					"Dr. Brown", "Bob", "12-02-2025", "10:30 AM");
			serializer.saveAppointment(ap2);
		}, "Thread-2");

		// Start both threads
		t1.start();
		t2.start();
	}
}
