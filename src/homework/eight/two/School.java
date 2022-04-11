package homework.eight.two;

public class School {
	private Teacher teacher;
	private Student student;
	private String name;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "School [teacher=" + teacher + ", student=" + student + ", name=" + name + "]";
	}
	
	
}
