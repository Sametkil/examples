package whileLoop;

public class ExampleThree {
	// 1 den 10 a kadar 10 dahil çift sayýlarýn toplamýný istiyorum
	// döngü 20 ye kadar gidecek þekilde olmalý fakat 10 dan sonra kýrmanýzý istiyorum
	//çift sayýlarýn toplamýnda continue kullanmanýzý istiyorum
	public static void main(String[] args) {
		int number=0;
		int sum=0;
		
		while(number<20) {
			number++;    //number =10
			if(number%2!=0) {
				continue;
			}
			if(number==10) {
				break;
			}
			sum+=number; // sum = sum + number
			System.out.println(number); // sum =6
		}
		System.out.println("Sum :" + sum);

	}

}
