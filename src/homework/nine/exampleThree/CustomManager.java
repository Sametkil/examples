package homework.nine.exampleThree;

public class CustomManager {
	private double phonePrice;
	private double phoneOtv;
	
	public void infoMessage() {
		if(phonePrice > 3000) {
			phoneOtv=0.4;
		}else if (phonePrice < 3000 && phonePrice > 1500) {
			phoneOtv=0.25;
		}else {
			phoneOtv=0.15;
		}
		
	}
	
	
	
	public void setPhonePrice(double phonePrice) {
		this.phonePrice = phonePrice;
	}



	public void doTheShopping(BasePhoneManager basePhoneManager) {
		System.out.println(basePhoneManager.getPhoneBrand() + " - "
	+ basePhoneManager.getPhoneModel() + " - " + basePhoneManager.buyTelephone(phonePrice, phoneOtv));
	}
}
