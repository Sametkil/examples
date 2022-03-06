package doWhile;
import java.util.Scanner;

public class ExampleFour {

	//5! = 5*4*3*2*1 = 120
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number=scanner.nextInt();
		int result=1;
		do {
		  result = result * number;
		  number--;
		}while(number>0);
		
		System.out.println("Result :"+result);

	}

}
