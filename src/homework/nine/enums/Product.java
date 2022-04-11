package homework.nine.enums;

public class Product {
	private String name;
	private ProductCategory productCategory;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", productCategory=" + productCategory.getName() + "]";
	}
	
	
}
