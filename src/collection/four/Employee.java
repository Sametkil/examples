package collection.four;

public class Employee implements Comparable<Employee>{
	private String name;
	private String surname;
	private double salary;
	public Employee(String name, String surname, double salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
	
	//negatif d�nerse this<that
	//0 d�nerse this=that
    //pozitif d�nerse this>that
	@Override
	public int compareTo(Employee o) {
		if(this.salary<o.salary)
			return 1;
		else if (this.salary == o.salary)
			return 0;
		return -1;
	}
	
}
