package homework.seven;

import java.io.Serializable;

public class Employee implements Serializable{
	public String name;
	public String surname;
	public int age;
	public double salary;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age="
				+ age + ", salary=" + salary + "]";
	}	
}
