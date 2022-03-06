package switchWhile;
import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Harf Giriniz:");
		//char charVal2=scanner.next().charAt(0);
		String strigVal = scanner.next();
		char charVal=strigVal.charAt(0);
		
		switch(charVal) {
		case 'a':
		case 'e':
		case 'ý':
		case 'i':
		case 'o':
		case 'ö':
		case 'u':
		case 'ü':
			System.out.println("Unlu Harf");
			break;
		default: 
			System.out.println("Unsuz Harf");
		}

	}

}
