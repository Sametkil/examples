package io;

import java.io.FileWriter;
import java.util.Scanner;

public class ExampleTryWithResource {

	// dil dosyas�na kullan�c�dan dil al�p(string)
	// al�nan dili dosya yazd�rma i�lemi
	// sonsuz d�ng� ile dil giri�i sa�lanmal�.
	// -1 girerse d�ng� sonlans�n dosya yaz�m tamamlans�n.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try (FileWriter fw = new FileWriter("Languages.txt")) {
			while (true) {
				System.out.println("Dil Girin (Cikis -1) :");
				String lang = scanner.next();
				if (lang.equals("-1")) {
					break;
				}
				fw.write(lang+"\n");
			}
		} catch (Exception e) {
		}

	}

}
