package enums;
public enum CoffeeSize {
	MEDIUM(3),SMALL(1),LARGE(5);
	
	protected int litre;
	
	private CoffeeSize(int litre){
		this.litre=litre;
	}
	
	public int getLitre() {
		return this.litre;
	}
}
