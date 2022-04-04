package abstraction.exampleone;

public class Main {

	public static void main(String[] args) {
		
		/*Spider spider = new Spider();
		spider.eat();
		spider.walk();
		System.out.println(spider.legs);*/
		/* TODO: Tavsiye edilmez.
		 Animal animal = new Animal(8) {
			
			@Override
			public void eat() {
				System.out.println("Animal eating...");
				
			}
		};
		*/
		Spider spider = new Spider();
		Fish fish = new Fish();
		Cat cat = new Cat();
		
		testObject(spider);
		testObject(fish);
		testObject(cat);
		//testObject(animal);

	}
	
	public static void testObject(Animal animal) {
		System.out.println(animal.getClass().toString());
		animal.eat();
		animal.walk();
		System.out.println(animal.legs);
	}

}
