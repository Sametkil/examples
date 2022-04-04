package inheritance.employee;

public class Main {
	
	
	//Employee bir üst class
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
	
	//main classý
	//Developer objesi, Test objesi, Analyst objesi
	//Developer calculateAnnualSalary calculateParentAnnualSalary
	//Test calculateAnnualSalary calculateParentAnnualSalary
	//Analyst calculateAnnualSalary calculateParentAnnualSalary
	// tüm objelere name surname el ile deðer atayýnýz.
	
	/*
	 * default developer maaþý 10000
	 * default analist maaþý 9000
	 * default test maaþý 8000 olacak þekilde classlar default- 
	 * contructor ile maaþ setleyin.
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
