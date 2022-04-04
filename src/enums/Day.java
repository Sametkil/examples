package enums;
//Monday Tuesday Wednesday Thursday Friday Saturday Sunday
//haftanýn kaçýncý günü
//name türkçesini 
//main class da for ile tüm enum larý gösterin
public enum Day {
	MONDAY(1,"Pazartesi")
	,TUESDAY(2,"Salý")
	,WEDNESDAY(3,"Çarþamba")
	,THURSDAY(4,"Perþembe")
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
