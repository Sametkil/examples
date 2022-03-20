package io;

import java.io.Serializable;

public class Student implements Serializable{
	public String name;
	public String surname;
	public String department;
	public String lessons;
	
	public Student(String name,
			String surname, 
			String department,
			String lessons) {
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.lessons = lessons;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", department=" + department + ", lessons=" + lessons
				+ "]";
	}	
}
