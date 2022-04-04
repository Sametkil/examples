package enums;
//Monday Tuesday Wednesday Thursday Friday Saturday Sunday
//haftan�n ka��nc� g�n�
//name t�rk�esini 
//main class da for ile t�m enum lar� g�sterin
public enum Day {
	MONDAY(1,"Pazartesi")
	,TUESDAY(2,"Sal�")
	,WEDNESDAY(3,"�ar�amba")
	,THURSDAY(4,"Per�embe")
	,FRIDAY(5,"Cuma")
	,SATURDAY(6,"Cumartesi")
	,SUNDAY(7,"Pazar");
	
	private int dayofWeek;
	private String name;
	
	private Day(int dayofWeek, String name) {
		this.dayofWeek= dayofWeek;
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDayofWeek() {
		return dayofWeek;
	}
}
