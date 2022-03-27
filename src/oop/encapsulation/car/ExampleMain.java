package oop.encapsulation.car;

public class ExampleMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("320");
		car.setYear(2021);
		
		Person driver = new Person();
		driver.setAge(20);
		driver.setName("Burak");
		driver.setSurname("Duman");
		car.setDriver(driver);
		
		Brand brand = new Brand();
		brand.setName("BMW");
		car.setBrand(brand);
		
		System.out.println("Car : "+ car.toString());
	}

}
