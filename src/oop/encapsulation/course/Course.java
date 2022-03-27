package oop.encapsulation.course;

public class Course {
	private String name;
	private Price price;
	private Person teacher;
	private Person student;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public Person getTeacher() {
		return teacher;
	}
	public void setTeacher(Person teacher) {
		this.teacher = teacher;
	}
	public Person getStudent() {
		return student;
	}
	public void setStudent(Person student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", price=" + price + ", teacher=" + teacher + ", student=" + student + "]";
	}
}
