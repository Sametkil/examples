package oop;

public class ExamplePassByRorVThree {

	public static void main(String[] args) {
		String s1 = "burak";
		changeValue(s1);
		System.out.println("X:"+ s1);

	}
	
	public static void changeValue(String s2) {
		s2="duman";
		System.out.println("X(method):"+ s2);
		
	}


}
