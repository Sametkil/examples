package homework.nine.enums;

public class Order {
	private Product product;
	private MoneyAmount moneyAmount;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public MoneyAmount getMoneyAmount() {
		return moneyAmount;
	}
	public void setMoneyAmount(MoneyAmount moneyAmount) {
		this.moneyAmount = moneyAmount;
	}
	@Override
	public String toString() {
		return "Order [product=" + product + ", moneyAmount=" + moneyAmount + "]";
	}
	
	
}
