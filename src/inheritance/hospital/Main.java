package inheritance.hospital;

public class Main {
	//hospital, patient doctor person adlar�nda 4 class
	// hospital patient objesi, doctor objesi, 1 string name field
	//Patient patient_report(string) 
	//doctor id_number long 
	//person class�nda name surname string
	//patient ve doctor classlar�n�n ana s�n�f� person olsun
	//main de patient objesi doktor objesi olu�turup doldurun
	//hastane objesi olu�turup daha �nce olu�turulan doctor  ve 
	//hasta objelerini setleyin
	//sonra toString hastane objesini yazd�r�n.
	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.setName("AAAA");
		patient.setSurname("BBBBB");
		patient.setPatient_report("DDDDD");
		
		Doctor doctor = new Doctor();
		doctor.setName("EEEEE");
		doctor.setSurname("FFFFF");
		doctor.setId_number(100);
		
		
		Hospital hospital = new Hospital();
		hospital.setPatient(patient);
		hospital.setDoctor(doctor);
		hospital.setName("ABCDEF");
		
		System.out.println(hospital.toString());
	}

}
