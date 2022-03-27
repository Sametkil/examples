package oop.inheritance.hospital;

public class Patient extends Person{
	private String patient_report;

	public String getPatient_report() {
		return patient_report;
	}

	public void setPatient_report(String patient_report) {
		this.patient_report = patient_report;
	}

	@Override
	public String toString() {
		return "Patient [patient_report=" +
	patient_report + ",name=" 
				+ getName() + ", surname="
				+ getSurname() + "]";
	}	
	
	
}
