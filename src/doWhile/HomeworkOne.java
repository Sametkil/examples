package doWhile;
import java.util.Scanner;

public class HomeworkOne {
/*
 * 1- A�a��daki switch kodunu if li yap�ya �evirerek tekrar yaz�n�z.
switch(m){ 
case 0: 
 x=x+2; 
 System.out.println(�X=� x);  
break;
 case 1:  
x=x+4;  
System.out.println(�X=� x);  
break; 
case 2: 
 x=x+6; 
 System.out.println(�X=� x); 
 break; 
} 
Yukar�da ;
m kullan�c�dan al�nan bir int de�er.
x ise x=6 gibi olu�turulacak bir de�i�ken. 

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
