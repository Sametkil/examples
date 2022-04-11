package collection.four;

import java.util.ArrayList;
import java.util.Collections;

public class EmpMain {

	public static void main(String[] args) {
		Employee emp = new Employee("eda", "eda", 1500);
		Employee emp2 = new Employee("cuneyt", "cuneyt", 2000);
		Employee emp3 = new Employee("taner", "taner", 500);
		Employee emp4 = new Employee("ibrahim", "ibrahim", 750);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		
		for(Employee s : empList) {
			System.out.println(s.getName() + "-"+s.getSurname()+"-"+s.getSalary());
		}
		System.out.println("Sorting...");
		Collections.sort(empList);
		for(Employee s : empList) {
			System.out.println(s.getName() + "-"+s.getSurname()+"-"+s.getSalary());
		}
		
		System.out.println("Reverse Sorting...");
		Collections.sort(empList, Collections.reverseOrder());
		for(Employee s : empList) {
			System.out.println(s.getName() + "-"+s.getSurname()+"-"+s.getSalary());
		}
	}

}
