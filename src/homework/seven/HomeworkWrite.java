package homework.seven;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeworkWrite {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ilk sayi:");
		int numberOne = scanner.nextInt();
		System.out.println("Ikinci sayi:");
		int numberTwo = scanner.nextInt();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(
				"calculate.txt", true))) {
			writer.write("Girilen ilk sayi:" + numberOne + "\n");
			writer.write("Girilen ikinci sayi:" + numberTwo + "\n");
			writer.write("Toplam:" + (numberOne + numberTwo) + "\n");
			writer.write("Fark:" + (numberOne - numberTwo) + "\n");
			writer.write("Carpim:" + (numberOne * numberTwo) + "\n");
			writer.write("Bolum:" + (numberOne / numberTwo) + "\n");
		} catch (IOException ex) {
			System.out.println("Dosya açýlýrken hata oluþtu...");
		}

	}

}
