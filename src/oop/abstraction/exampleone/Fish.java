package oop.abstraction.exampleone;

public class Fish extends Animal{
	
	public Fish() {
		super(0);
	}
	
	@Override
	public void eat() {
		System.out.println("Fish eating...");
	}
}
