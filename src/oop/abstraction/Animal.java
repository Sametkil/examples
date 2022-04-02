package oop.abstraction;
public abstract class Animal {

	public void makeSound() {
		System.out.println("Animal sound...");
	}
	
	abstract public int footCount();
}
