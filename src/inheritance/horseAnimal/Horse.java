package inheritance.horseAnimal;

public class Horse extends Animal{
	
	private int nalSayisi;
	private String owner;
	
	public int getNalSayisi() {
		return nalSayisi;
	}
	
	public void setNalSayisi(int nalSayisi) {
		this.nalSayisi = nalSayisi;
	}

	public Horse(int nalSayisi) {
		//this("DDDD");
		this.nalSayisi = nalSayisi;
		System.out.println("Parametreli Horse Cons");
	}
	
	public Horse(String owner) {
		this(4);
		this.owner = owner;
		System.out.println("Parametreli Horse Owner Cons");
	}
	
	public Horse() {
		super("BBBB");
		System.out.println("Defult Horse Cons");
	}
	
	@Override
	public String toString() {
		return "Horse [nalSayisi=" + nalSayisi + ", "
				+ "owner=" + owner + ", "
				+ "animal=" + super.toString() + "]";
	}

	
	
 
}
