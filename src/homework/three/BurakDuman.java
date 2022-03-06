package homework.three;
import java.util.Scanner;

public class BurakDuman {
	//12345678 -> 87654321
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz:");
		int number =  scanner.nextInt();
		System.out.println(reverse(number));
	}
	
	public static int reverse(int number) {
		int result=0;
		//12345678 1234567
		while(number>0) {
			result=(10*result)+(number%10);
			number/=10;
		}
		return result;
	}

}
