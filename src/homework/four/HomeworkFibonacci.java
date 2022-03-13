import java.util.Scanner;

public class HomeworkFibonacci {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz:");
		int number=scanner.nextInt();
		System.out.println("Fibonacci : "+ findFibonacci(number));
		
	}
	
	public static int findFibonacci(int number) {
		if(number==0 || number==1) {
			return number;
		}else {
			return findFibonacci(number-1)+findFibonacci(number-2);
		}
	}

}
