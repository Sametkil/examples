package exception;
import java.util.Scanner;

public class ExampleExpTwo {
	// kullanýcýdan bir yaþ alýn
	// 18 den küçük ise exp
	// 18 den büyük ise syso Yetkili giriþ
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yas Giriniz:");
		int age = scanner.nextInt();
		try {
			method1(age);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Bitti");
	}

	public static void method1(int age) {
		if (age < 18)
			throw new 
			ArithmeticException("Yetkisiz Yas");
		else
			System.out.println("Yetkili Yas");
	}

}
