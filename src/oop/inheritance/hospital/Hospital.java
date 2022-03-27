package oop.inheritance.hospital;

public class Hospital {
	private String name;
	private Doctor doctor;
	private Patient patient;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Hospital [name=" + name + 
				", doctor=" + doctor + 
				", patient=" + patient + "]";
	}
	
	
}
