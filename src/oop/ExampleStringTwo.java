package oop;

import java.util.Scanner;

public class ExampleStringTwo {
	//kullanýcýdan cümle alýn
	//cümle de kaç kelime var bulunuz.
	//cümledeki harf sayýsýný bulunuz.
	//cümlede kedi kelimesi geçiyorsa kopek yapýnýz.
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
