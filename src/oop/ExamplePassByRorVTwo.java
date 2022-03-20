package oop;

public class ExamplePassByRorVTwo {

	public static void main(String[] args) {
		Integer s1 = 5;
		changeValue(s1);
		System.out.println("X:"+ s1);

	}
	
	public static void changeValue(Integer s2) {
		s2=10;
		System.out.println("X(method):"+ s2);
		
	}

}
