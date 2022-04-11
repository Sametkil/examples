package homework.nine.enums;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Harry Potter");
		product.setProductCategory(ProductCategory.BOOKS);
		
		MoneyAmount moneyAmount = new MoneyAmount();
		moneyAmount.setAmount(100);
		moneyAmount.setCurrency(Currency.DOLAR);
		
		Order order = new Order();
		order.setMoneyAmount(moneyAmount);
		order.setProduct(product);
		
		
		System.out.println(order.toString());

	}

}
