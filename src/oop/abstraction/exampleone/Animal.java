package oop.abstraction.exampleone;

public abstract class Animal {
	protected int legs;
	
	public Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("Animal walking...");
	}
	
	abstract public void eat();
}
