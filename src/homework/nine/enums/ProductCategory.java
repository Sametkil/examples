package homework.nine.enums;

public enum ProductCategory {
	BOOKS("books"),MUSIC("music"),VIDEO("video"),SOFTWARE("software");
	private String name;
	
	private ProductCategory(String name) {
		this.name= name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
}
