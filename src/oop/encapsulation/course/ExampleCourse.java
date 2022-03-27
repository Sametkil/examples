package oop.encapsulation.course;

public class ExampleCourse {
	
	// Course ad�nda bir class 
	// name (string), price (Price class), teacher (person class)
	//,student (person class)
	// Person ad�nda bir class name(string),surname(string)
	//Price ad�nda bir class fee (double),currency(string)
	//main course tostring ile girilen de�erleri yazd�r�n.
	public static void main(String[] args) {
		Person student = new Person();
		student.setName("AAAA");
		student.setSurname("BBBB");
		
		Person teacher = new Person();
		teacher.setName("EEEEE");
		teacher.setSurname("DDDDD");
		
		Price price = new Price();
		price.setCurrency("TRY");
		price.setFee(1000);
		
		Course course = new Course();
		course.setName("Java");
		course.setStudent(student);		
		course.setTeacher(teacher);		
		course.setPrice(price);
		
		
		System.out.println("Course : "+course.toString());
		
	}

}
