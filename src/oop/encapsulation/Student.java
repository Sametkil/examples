package oop.encapsulation;

public class Student {
    private String name;
    private String surname;
    private String number;
    private Lesson lesson;
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	@Override
	public String toString() {
		return "Student [name=" + name +
				", surname=" + surname + ", "
						+ "number=" + number + ","
								+ " lesson=" 
						+ lesson + "]";
	}
	
	
}
