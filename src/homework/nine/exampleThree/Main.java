package homework.nine.exampleThree;

public class Main {

	public static void main(String[] args) {
		BasePhoneManager samsung = new Samsung("Samsung","S9");
		BasePhoneManager apple = new Apple("Apple","Iphone13");
		
		CustomManager customManager = new CustomManager();
		customManager.setPhonePrice(1000);
		customManager.infoMessage();
		customManager.doTheShopping(samsung);
		customManager.doTheShopping(apple);
		

	}

}
