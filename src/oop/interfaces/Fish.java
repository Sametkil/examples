package oop.interfaces;

public class Fish extends Animal implements Pet{
	private String name;
	
	public Fish() {
		super(0);
	}
	
	@Override
	public void eat() {
		System.out.println("Fish eating...");
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void play() {
		System.out.println("Fish playing...");
	}
}
