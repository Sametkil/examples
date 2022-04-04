package inheritance.employee;

public class Main {
	
	
	//Employee bir �st class
	//name surname salary field
	//calculateAnnualSalary method . salary*12
	
	//Developer  subclass 
	//calculateParentAnnualSalary -> Employee.calculateAnnualSalary
	//calculateAnnualSalary salary*16
	
	//Test subclass 
	//calculateParentAnnualSalary -> Employee.calculateAnnualSalary
	//calculateAnnualSalary salary*14
	
	//Analyst subclass 
	//calculateParentAnnualSalary -> Employee.calculateAnnualSalary
	//calculateAnnualSalary salary*15
	
	//main class�
	//Developer objesi, Test objesi, Analyst objesi
	//Developer calculateAnnualSalary calculateParentAnnualSalary
	//Test calculateAnnualSalary calculateParentAnnualSalary
	//Analyst calculateAnnualSalary calculateParentAnnualSalary
	// t�m objelere name surname el ile de�er atay�n�z.
	
	/*
	 * default developer maa�� 10000
	 * default analist maa�� 9000
	 * default test maa�� 8000 olacak �ekilde classlar default- 
	 * contructor ile maa� setleyin.
	 */

	public static void main(String[] args) {
		Developer developer = new Developer();
		//Developer developer = new Developer("Developer","Developer");
		System.out.println(
				developer.getName()+developer.getSurname()+": "+
				developer.calculateAnnualSalary()
				+"-"+developer.calculateParentAnnualSalary());

	}

}
