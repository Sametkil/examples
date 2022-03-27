package oop.inheritance.employee;

public class Test extends Employee{
	
	public Test() {
		this("Test","Test");
	}
	
	public Test(String name, String surname) {
		super(name,surname,8000);
	}
	
	@Override
	public double calculateAnnualSalary() {
		return getSalary()*14;
	}
	
	public double calculateParentAnnualSalary() {
		return super.calculateAnnualSalary();
	}
}
