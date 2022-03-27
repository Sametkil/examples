package oop.encapsulation.car;

public class Car {
	private String model;
	private int year;
	private Person driver;
	private Brand brand;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Person getDriver() {
		return driver;
	}
	public void setDriver(Person driver) {
		this.driver = driver;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" 
	+ year + ", driver=" + driver + ", brand=" + brand + "]";
	}
	
	
}
