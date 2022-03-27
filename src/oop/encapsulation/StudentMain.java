package oop.encapsulation;

/*
 * Car class oluþturun . model (string), year(int), 
 * driver person objesi, brand objesi
 * brand (class) name field
 * Person class oluþturun. name surname age
 * main yazýlacak. car objesi tostring denildiðinde tüm
 *  girilen deðerler console da gösterilecek.
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
