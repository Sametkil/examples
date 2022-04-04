package inheritance.employee;

public class Analyst extends Employee{
	
	public Analyst() {
		this("Analyst","Analyst");
	}
	
	public Analyst(String name, String surname) {
		super(name,surname,9000);
	}
	
	@Override
	public double calculateAnnualSalary() {
		return getSalary()*15;
	}
	
	public double calculateParentAnnualSalary() {
		return super.calculateAnnualSalary();
	}
}