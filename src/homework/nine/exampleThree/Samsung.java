package homework.nine.exampleThree;

public class Samsung extends BasePhoneManager{

	public Samsung(String phoneBrand, String phoneModel) {
		super(phoneBrand,phoneModel);
	}

	@Override
	public double buyTelephone(double price, double otv) {
		return price+(otv*100)-200;
	}
}
