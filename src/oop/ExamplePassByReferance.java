package oop;

public class ExamplePassByReferance {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="Burak";
		changeValue(s1);
		System.out.println("Name:"+ s1.name);

	}
	
	public static void changeValue(Student s2) {
		s2.name="Duman";
		System.out.println("Name:"+ s2.name);
		
	}

}
