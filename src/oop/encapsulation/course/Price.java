package oop.encapsulation.course;

public class Price {
	private double fee;
	private String currency;
	
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "Price [fee=" + fee + ", currency=" + currency + "]";
	}	
}
