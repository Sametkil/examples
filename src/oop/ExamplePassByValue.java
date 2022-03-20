package oop;

public class ExamplePassByValue {

	public static void main(String[] args) {
		int x=3;
		changeValue(x);
		System.out.println("X : "+x);

	}
	
	public static void changeValue(int x) {
		x+=2;
		System.out.println("X(method) :"+x);
	}
}
