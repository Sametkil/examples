package homework.four;

import java.util.Scanner;

public class HomeworkEbobEkok {
	//48 = 2*2*2*2*3
	//160= 2*2*2*2*2*5

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ilk sayiyi giriniz:");
		int numberOne= scanner.nextInt();
		System.out.println("Ikinci sayiyi giriniz:");
		int numberTwo= scanner.nextInt();
		
		System.out.println("Ebob : "+ findEbob(numberOne, numberTwo));
		System.out.println("Ekok : "+ findEkok(numberOne, numberTwo));
	}
	
	public static int findEbob(int numberOne,int numberTwo) {
		int ebob=1;
		for(int i=1;i<=numberOne && i<=numberTwo ;i++) {
			if(numberOne%i==0 && numberTwo%i==0) {
				ebob=i;
			}
		}
		return ebob;
	}
	public static int findEkok(int numberOne,int numberTwo) {
		/*int maxNumber= numberOne*numberTwo;
		int ekok=0;
		
		for(int i=maxNumber;i>0;i--) {
			if(i%numberOne==0 && i%numberTwo==0) {
				ekok=i;
			}
		}
		return ekok;*/
		
		/*int ekok = (numberOne*numberTwo)/
				(findEbob(numberOne, numberTwo));
		return ekok;*/
		
		return (numberOne*numberTwo)/
				findEbob(numberOne, numberTwo);
	}
}
