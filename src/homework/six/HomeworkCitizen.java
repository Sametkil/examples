package homework.six;

public class HomeworkCitizen {
	/*
	 * Citizen ad�nda bir class olu�turunuz.
	 *  Class��n attribute leri tcNumber,name,surname(hepsi string) olmal�d�r.
	 *   Ayr�ca class �n toString ve t�m attributelerini i�eren contructor �n� 
	 *   tan�mlaman�z� istiyorum. Daha sonra main de Citizen s�n�f�n�n 2 
	 *   objesini olu�turun. Objelerden birini olu�tururken parametresiz 
	 *   contructor  ile olu�turunuz. Daha sonra toString i ile ekrana yazd�r�n�z. Di�er objeyi ise parametreli contructor  ile olu�turup toString ile ekrana yazd�r�n�z.
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
