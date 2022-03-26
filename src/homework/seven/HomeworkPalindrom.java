package homework.seven;

import java.util.Scanner;

public class HomeworkPalindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime:");
		String word = scanner.next();
		String reverseWord = new StringBuilder(word).reverse().toString();
		if(word.equals(reverseWord)){
			System.out.println("Palindrom");
		}else{
			System.out.println("Palindrom Degil");
		}
	}

}
