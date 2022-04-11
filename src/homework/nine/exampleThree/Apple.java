package homework.nine.exampleThree;

public class Apple extends BasePhoneManager{
	
	public Apple(String phoneBrand, String phoneModel) {
		super(phoneBrand,phoneModel);
	}

	@Override
	public double buyTelephone(double price, double otv) {
		return price+(otv*100);
	}

}
