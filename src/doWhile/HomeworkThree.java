package doWhile;
import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number=scanner.nextInt();
		int counter2=1;
		
		while(number>=1) {
			counter2=1;
			while(counter2<=number) {
				System.out.print("*");
				counter2++;
			}
			System.out.println("");
			number--;
		}

	}

}
