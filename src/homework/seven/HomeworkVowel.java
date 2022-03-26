package homework.seven;

import java.util.Scanner;

public class HomeworkVowel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cumle:");
		String sentence = scanner.nextLine();
		int counter=0;
		 for(int i=0; i<sentence.length(); i++) {
	         if(sentence.charAt(i) == 'a'
	        		 || sentence.charAt(i) == 'e'
	        		 || sentence.charAt(i) == 'i' 
	        		 || sentence.charAt(i) == 'o' 
	        		 || sentence.charAt(i) == 'u'
	        		 || sentence.charAt(i) == 'ý'
	        		 || sentence.charAt(i) == 'ö'
	        		 || sentence.charAt(i) == 'ü') {
	        	 counter++;
	         }
	      }
		 System.out.println("Toplam sesli harf : "+ counter);

	}

}
