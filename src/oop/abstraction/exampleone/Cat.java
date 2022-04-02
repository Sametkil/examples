package oop.abstraction.exampleone;

public class Cat extends Animal{
	
	public Cat() {
		super(4);
	}
	
	@Override
	public void eat() {
		System.out.println("Cat eating...");
	}
}
