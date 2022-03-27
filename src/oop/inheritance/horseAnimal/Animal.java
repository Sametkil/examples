package oop.inheritance.horseAnimal;

public class Animal {
	private String name;
	private int footCount;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		this.name = name;
		System.out.println("Parametreli Animal Cons");
	}
	
	public Animal(String name,int footCount ) {
		this.name = name;
		this.footCount=footCount;
		System.out.println("Parametreli Animal Cons");
	} 
	
	public Animal() {
		System.out.println("Default Animal Cons");
	}

	public int getFootCount() {
		return footCount;
	}

	public void setFootCount(int footCount) {
		this.footCount = footCount;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + 
				", footCount=" + footCount + "]";
	}


	
}
