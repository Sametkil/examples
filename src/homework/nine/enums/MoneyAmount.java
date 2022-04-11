package homework.nine.enums;

public class MoneyAmount {

	private double amount;
	private Currency currency;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "MoneyAmount [amount=" + amount + ", currency=" + currency.getIcon() + "]";
	}
	
	
}
