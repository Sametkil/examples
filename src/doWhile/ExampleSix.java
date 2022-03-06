package doWhile;
import java.util.Scanner;

public class ExampleSix {

	// kullanýcýdan sayý istenecek.
	// kullanýcýnýn girdiði sayý 3 ve 5 e bölünebiliyorsa
	// kazandýnýz deðilse kullanýcýdan sayý istenecek.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		/*
		 * while(true) { System.out.println("Enter Number:"); number=scanner.nextInt();
		 * 
		 * if((number%3==0) && (number%5==0)) { System.out.println("Kazandiniz.");
		 * break; } }
		 */

		do {
			System.out.println("Enter Number:");
			number = scanner.nextInt();

			if ((number % 3 == 0) && (number % 5 == 0)) {
				System.out.println("Kazandiniz.");
				break;
			}
		} while (true);

	}

}
