package week3;

import java.io.*;

//PatientReport class must be serializable
class PatientReport implements Serializable {
	private String patientName;
	private String diagnosis;

	public PatientReport(String patientName, String diagnosis) {
		this.setPatientName(patientName);
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		return "PatientReport{patientName='" + getPatientName() + "', diagnosis='" + diagnosis + "'}";
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
}

//Exporting PatientReport to file with synchronized block
class ReportExporter {

	// Non-synchronized method with synchronized block for selective synchronization
	public void exportReport(PatientReport report) {
		synchronized (report) {  // synchronized block on the report object
			File file = new File(report.getPatientName() + "_report.dat");

			try (FileOutputStream fos = new FileOutputStream(file, true);
					ObjectOutputStream oos = 
							(file.length() == 0)
							? new ObjectOutputStream(fos)
									: new AppendableObjectOutputStream(fos)) {

				oos.writeObject(report);
				System.out.println(Thread.currentThread().getName() +
						" exported: " + report);

			} catch (IOException e) {
				System.out.println("Error exporting report: " + e.getMessage());
			}
		}
	}
	public static void main(String[] args) {

		ReportExporter exporter = new ReportExporter();

		PatientReport report1 = new PatientReport("Alice", "Flu");
		PatientReport report2 = new PatientReport("Bob", "Diabetes");

		// Thread 1 exports report1
		Thread t1 = new Thread(() -> exporter.exportReport(report1), "T1");

		// Thread 2 exports report2 (parallel with t1)
		Thread t2 = new Thread(() -> exporter.exportReport(report2), "T2");

		// Thread 3 exports report1 (should wait for t1)
		Thread t3 = new Thread(() -> exporter.exportReport(report1), "T3");

		// Thread 4 exports report2 (parallel with t1 and t3)
		Thread t4 = new Thread(() -> exporter.exportReport(report2), "T4");

		// Start all threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

//Custom ObjectOutputStream to avoid duplicate headers in append mode
//class AppendableObjectOutputStream extends ObjectOutputStream {
// public AppendableObjectOutputStream(OutputStream out) throws IOException {
//     super(out);
// }
//
// @Override
// protected void writeStreamHeader() throws IOException {
//     reset(); // Prevent writing stream header again
// }
//}


