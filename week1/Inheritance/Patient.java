//inheritance2: multi-level inheritance
package com.demo;

interface Insurance {
	void provideInsuranceDetails();
	void processClaim();
}

class Hospital implements Insurance {
	String hospitalName;

	public Hospital(String name) {
		this.hospitalName = name;
	}

	public void admitPatient() {
		System.out.println("Patient admitted to " + hospitalName);
	}

	@Override
	public void provideInsuranceDetails() {
		System.out.println("Providing insurance details for hospital: " + hospitalName);
	}

	@Override
	public void processClaim() {
		System.out.println("Processing insurance claim at " + hospitalName);
	}
}

class Patient extends Hospital {

	String patientName;

	public Patient(String patientName, String hospitalName) {
		super(hospitalName);  
		this.patientName = patientName;
	}

	public void getTreatment() {
		System.out.println(patientName + " is receiving treatment at " + hospitalName);
	}
	public static void main(String[] args) {
		Patient patient = new Patient("Aimee James", "Baby Memorial Hospital");

		patient.admitPatient();

		patient.provideInsuranceDetails();
		patient.processClaim();

		patient.getTreatment();
	}
}
