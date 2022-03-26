package homework.seven;

import java.util.Scanner;

public class HomeworkReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cumle:");
		String sentence = scanner.nextLine();
		String result="";
		char[] charArray = sentence.toCharArray();
		for(int i=charArray.length-1;i>=0;i--){
			result+=charArray[i];
		}
		System.out.println(result);
		String result2 = new StringBuilder(sentence).reverse().toString();
		System.out.println(result2);
	}

}
