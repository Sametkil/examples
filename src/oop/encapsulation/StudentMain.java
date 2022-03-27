package oop.encapsulation;

/*
 * Car class olu�turun . model (string), year(int), 
 * driver person objesi, brand objesi
 * brand (class) name field
 * Person class olu�turun. name surname age
 * main yaz�lacak. car objesi tostring denildi�inde t�m
 *  girilen de�erler console da g�sterilecek.
 */



public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Burak");
		student.setNumber("123123");
		student.setSurname("Duman");
		
		
		Lesson lesson = new Lesson();
		lesson.setName("ComputerScience");
		lesson.setTeacherName("Bill gates");
		
		student.setLesson(lesson);
		
		System.out.println("Name : "+ student.toString());
		System.out.println("Lesson : "+ student.getLesson().getName());

	}

}
