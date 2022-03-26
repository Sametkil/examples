package homework.six;

import java.util.Scanner;

public class HomeworkCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("Ilk sayi:");
		calculator.numberOne = scanner.nextInt();
		System.out.println("Ikinci sayi:");
		calculator.numberTwo = scanner.nextInt();
		
		System.out.println("Toplama Sonucu:"+calculator.sum());
		System.out.println("Cikarma Sonucu:"+calculator.diff());
		System.out.println("Carpma Sonucu:"+calculator.multiplication());
		System.out.println("Bolme Sonucu:"+calculator.divide());

	}

}
