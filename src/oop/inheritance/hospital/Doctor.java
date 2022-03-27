package oop.inheritance.hospital;

public class Doctor extends Person{
	private long id_number;

	public long getId_number() {
		return id_number;
	}

	public void setId_number(long id_number) {
		this.id_number = id_number;
	}

	@Override
	public String toString() {
		return "Doctor [id_number=" + 
	id_number + ", name=" + getName() +
	", surname=" + getSurname() + "]";
	}

	
}
