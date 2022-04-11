package streamApi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Secim:");
		int operation = scanner.nextInt();

		MathOperation mathOperation = null;
		switch (operation) {
		case 1:
			mathOperation = (a, b) -> a + b;
			break;
		case 2:
			mathOperation = (a, b) -> a - b;
			break;
		case 3:
			mathOperation = (a, b) -> a * b;
			break;
		case 4:
			mathOperation = (a, b) -> a / b;
			break;
		}
		mathOperation.run();
		System.out.println(mathOperation.operate(10, 6));
	}

}
