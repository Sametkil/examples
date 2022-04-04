package interfaces;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("Tekir");
		System.out.println(cat.getName());
		cat.play();
		cat.eat();
		cat.walk();
		System.out.println(cat.legs);
		
		Fish fish = new Fish();
		fish.setName("Somon");
		System.out.println(fish.getName());
		fish.play();
		fish.eat();
		fish.walk();
		System.out.println(fish.legs);
		
		Spider spider = new Spider();
		spider.eat();
		spider.walk();
		System.out.println(fish.legs);

	}
	
	public static void testObject(Animal animal) {
		System.out.println(animal.getClass().toString());
		animal.eat();
		animal.walk();
		System.out.println(animal.legs);
	}

}
