package homework.nine.exampleThree;

public abstract class BasePhoneManager {
	private String phoneBrand;
	private String phoneModel;

	public BasePhoneManager(String phoneBrand, String phoneModel) {
		super();
		this.phoneBrand = phoneBrand;
		this.phoneModel = phoneModel;
	}



	public String getPhoneBrand() {
		return phoneBrand;
	}



	public String getPhoneModel() {
		return phoneModel;
	}



	abstract public double buyTelephone(double price, double otv);
}
