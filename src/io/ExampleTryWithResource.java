package io;

import java.io.FileWriter;
import java.util.Scanner;

public class ExampleTryWithResource {

	// dil dosyasýna kullanýcýdan dil alýp(string)
	// alýnan dili dosya yazdýrma iþlemi
	// sonsuz döngü ile dil giriþi saðlanmalý.
	// -1 girerse döngü sonlansýn dosya yazým tamamlansýn.
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
