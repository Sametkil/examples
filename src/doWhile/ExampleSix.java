package doWhile;
import java.util.Scanner;

public class ExampleSix {

	// kullan�c�dan say� istenecek.
	// kullan�c�n�n girdi�i say� 3 ve 5 e b�l�nebiliyorsa
	// kazand�n�z de�ilse kullan�c�dan say� istenecek.
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
