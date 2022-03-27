package oop.encapsulation;

public class Lesson {

	private String name;
	private String teacherName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	@Override
	public String toString() {
		return "Lesson [name=" + name + ", teacherName=" + 
	teacherName + "]";
	}
	
	
}
