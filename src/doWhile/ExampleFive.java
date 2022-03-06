package doWhile;

public class ExampleFive {
	//1-10 arasýndaki tek sayýlarýn toplamý
	//10(dahil deðil)-20 arasýndaki çift sayýlarýn toplamý
	//kullanýcý ilk toplam ile ikinci toplamýn çarpýmý
	//tek döngülü hali ödev olacak.
	public static void main(String[] args) {
	//2000
		int counter=1;
		int sum=0;
		int sum2=0;
		int result;
		//1.döngü
		do {
			if(counter%2!=0) {
			  sum+=counter;	//sum = sum +counter
			}
			counter++;
		}while(counter<=10);
		
		System.out.println("Sum1:"+sum);
		//2.döngü
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
