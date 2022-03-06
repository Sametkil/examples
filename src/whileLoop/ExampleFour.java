package whileLoop;

public class ExampleFour {
// 10 ile 20 arasýndaki 4 ile bölünen sayýlarýn
//çarpýmýný bulunuz.
// 1 30 a kadar döngü kurmanýzý istiyorum.
// 3840
	public static void main(String[] args) {
		int number=0;
		int multiply=1;
		
		while(number<30) {
			number++;
			if(number<10) {
				continue;
			}
			if(number%4==0) {
			   multiply *=number; // multiply = multiply * number
			}
			if(number==20) {
				break;
			}
		}
		
		System.out.println("Multiply :" + multiply);

	}

}
