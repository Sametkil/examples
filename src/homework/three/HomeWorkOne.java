package homework.three;
import java.util.Scanner;

public class HomeWorkOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		final int sandalyeUcret = 150;
		final int masaUcret = 200;
		final int bilgisayarUcret = 3000;
		final int fareUcret = 10;
		final int yaziciUcret = 400;
		int adet = 0;
		int tutar = 0;
		do {
			System.out.println("Sepete atmak istediginiz urunu seciniz:\n" + "1-Sandalye\n" + "2-Masa\n"
					+ "3-Bilgisayar\n" + "4-Fare\n" + "5-Yazıcı\n" + "6-Sepet Tutarını Hesapla\n");
			number = scanner.nextInt();
			if (number != 6) {
				System.out.println("Almak istediginiz Adet");
				adet = scanner.nextInt();
			}
			switch (number) {
			case 1:
				tutar = tutar + (adet * sandalyeUcret);
				break;
			case 2:
				tutar = tutar + (adet * masaUcret);
				break;
			case 3:
				tutar = tutar + (adet * bilgisayarUcret);
				break;
			case 4:
				tutar = tutar + (adet * fareUcret);
				break;
			case 5:
				tutar = tutar + (adet * yaziciUcret);
				break;
			default:
			}
		} while (number != 6);
		
		System.out.println("Toplam Tutar :"+tutar);

	}

}
