package doWhile;
import java.util.Scanner;

public class HomeworkOne {
/*
 * 1- Aþaðýdaki switch kodunu if li yapýya çevirerek tekrar yazýnýz.
switch(m){ 
case 0: 
 x=x+2; 
 System.out.println(“X=” x);  
break;
 case 1:  
x=x+4;  
System.out.println(“X=” x);  
break; 
case 2: 
 x=x+6; 
 System.out.println(“X=” x); 
 break; 
} 
Yukarýda ;
m kullanýcýdan alýnan bir int deðer.
x ise x=6 gibi oluþturulacak bir deðiþken. 

 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m;
		int x=6;
		System.out.println("Bir sayi giriniz:");
		m= scanner.nextInt();

		if(m==0) {
			x=x+2; 
			System.out.println("X="+x); 	
		}else if(m==1) {
			x=x+4;  
			System.out.println("X=" +x);  
		}else if(m==2) {
			 x=x+6; 
			 System.out.println("X="+x); 
		}
		
		System.out.println("Bitti");
	}

}
