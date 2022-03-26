package homework.six;

public class Citizen {
	public String tcNumber;
	public String name;
	public String surname;
	
	public Citizen(String tcNumber, String name, String surname) {
		this.tcNumber = tcNumber;
		this.name = name;
		this.surname = surname;
	}
	
	public Citizen() {
	}

	@Override
	public String toString() {
		return "Citizen [tcNumber=" + tcNumber + ", name=" + name
				+ ", surname=" + surname + "]";
	}
}
