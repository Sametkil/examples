package abstraction.thirdexample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("first number:");
		int numberOne= scanner.nextInt();
		System.out.println("second number:");
		int numberTwo= scanner.nextInt();
		MathematicalOperationImplementation moi
		= new MathematicalOperationImplementation();
		System.out.println("Sum:"+moi.sum(numberOne, numberTwo));
		System.out.println("Difference:"+moi.difference(numberOne, numberTwo));
		System.out.println("Multiply:"+moi.multiply(numberOne, numberTwo));
		System.out.println("Divide:"+moi.divide(numberOne, numberTwo));
	}

}
