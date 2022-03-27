package oop.inheritance.employee;

//Developer  subclass 
	//calculateParentAnnualSalary -> Employee.calculateAnnualSalary
	//calculateAnnualSalary salary*16
public class Developer extends Employee{
	
	public Developer() {
		this("Developer","Developer");
	}
	
	public Developer(String name, String surname) {
		super(name,surname,10000);
	}

	@Override
	public double calculateAnnualSalary() {
		return getSalary()*16;
	}
	
	public double calculateParentAnnualSalary() {
		return super.calculateAnnualSalary();
	}
}
