package collection.four;

public class Student implements Comparable<Student>{
	private String name;
	private String surname;
	private int number;

	public Student(String name, String surname, int number) {
		super();
		this.name = name;
		this.surname = surname;
		this.number = number;
	}

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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", number=" + number + "]";
	}

	//negatif dönerse this<that
	//0 dönerse this=that
	//pozitif dönerse this>that
	@Override
	public int compareTo(Student o) {
		return o.getNumber()-this.number;
	}

}
