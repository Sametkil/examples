package homework.nine.enums;

public enum Currency {
	DOLAR("$"),TL("₺"),EURO("€");
	private String icon;
	
	private Currency(String icon) {
		this.icon = icon;
	}
	
	public String getIcon() {
		return this.icon;
	}
}
