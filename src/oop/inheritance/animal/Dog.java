package oop.inheritance.animal;

import java.util.Objects;

public class Dog extends Animal{
	private int age;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("Displaying...");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog Eating...");
	}
	
	public void parentEat() {
		super.eat();
	}
	
	@Override
	public String toString() {
		return "Dog [age=" + age + 
				","
				+ " Animal=" + super.toString() + "]";
	}
	
}
