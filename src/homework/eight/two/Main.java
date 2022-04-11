package homework.eight.two;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(10);
		student.setFinalGrade(90);
		student.setMidTermGrade1(80);
		student.setMidTermGrade2(40);
		student.setName("StudentName");
		student.setSurname("StudentSurname");
		
		
		Teacher teacher = new Teacher();
		teacher.setAge(30);
		teacher.setLessonName("Math");
		teacher.setName("TeacherName");
		teacher.setSurname("TeacherSurname");
		
		
		School school = new School();
		school.setName("SchoolName");
		school.setStudent(student);
		school.setTeacher(teacher);
		
		System.out.println(school.toString());
	}

}
