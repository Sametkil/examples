package homework.six;

public class HomeworkCitizen {
	/*
	 * Citizen adýnda bir class oluþturunuz.
	 *  Class’ýn attribute leri tcNumber,name,surname(hepsi string) olmalýdýr.
	 *   Ayrýca class ýn toString ve tüm attributelerini içeren contructor ýný 
	 *   tanýmlamanýzý istiyorum. Daha sonra main de Citizen sýnýfýnýn 2 
	 *   objesini oluþturun. Objelerden birini oluþtururken parametresiz 
	 *   contructor  ile oluþturunuz. Daha sonra toString i ile ekrana yazdýrýnýz. Diðer objeyi ise parametreli contructor  ile oluþturup toString ile ekrana yazdýrýnýz.
	 */
	public static void main(String[] args) {
		Citizen c1 = new Citizen("330856*****", "burak", "duman");
		Citizen c2 = new Citizen();
		c2.tcNumber = "12345678912";
		c2.name="name";
		c2.surname="surname";
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
