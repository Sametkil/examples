package doWhile;

public class ExampleFive {
	//1-10 aras�ndaki tek say�lar�n toplam�
	//10(dahil de�il)-20 aras�ndaki �ift say�lar�n toplam�
	//kullan�c� ilk toplam ile ikinci toplam�n �arp�m�
	//tek d�ng�l� hali �dev olacak.
	public static void main(String[] args) {
	//2000
		int counter=1;
		int sum=0;
		int sum2=0;
		int result;
		//1.d�ng�
		do {
			if(counter%2!=0) {
			  sum+=counter;	//sum = sum +counter
			}
			counter++;
		}while(counter<=10);
		
		System.out.println("Sum1:"+sum);
		//2.d�ng�
		do {
			if(counter%2==0) {
				sum2+=counter;
			}
			counter++;
		}while(counter<=20);
		System.out.println("Sum2:"+sum2);
		result = sum * sum2;
		System.out.println("Result:"+result);
		
	}

}
