package oop.encapsulation.course;

public class ExampleCourse {
	
	// Course adýnda bir class 
	// name (string), price (Price class), teacher (person class)
	//,student (person class)
	// Person adýnda bir class name(string),surname(string)
	//Price adýnda bir class fee (double),currency(string)
	//main course tostring ile girilen deðerleri yazdýrýn.
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
