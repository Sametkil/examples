package oop;

import java.util.Scanner;

public class ExampleStringTwo {
	//kullan�c�dan c�mle al�n
	//c�mle de ka� kelime var bulunuz.
	//c�mledeki harf say�s�n� bulunuz.
	//c�mlede kedi kelimesi ge�iyorsa kopek yap�n�z.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir cumle giriniz:");
		String sentence = scanner.nextLine();
		
		System.out.println(sentence.split(" ").length + " kelime var.");
		System.out.println(
				sentence.replace(" ", "").length() + " harf var.");
		System.out.println("replace :" + 
				sentence.replace("kedi", "kopek"));

	}

}
