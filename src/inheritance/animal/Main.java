package inheritance.animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("AAAA");
		dog.setAge(10);
		dog.eat();
		dog.display();
		dog.parentEat();
		System.out.println(dog.getName());
		System.out.println(dog.toString());

	}

}
