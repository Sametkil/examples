package doWhile;

public class HomeworkTwo {

	public static void main(String[] args) {
		int counter=2;
		int counter2=2;
		boolean isPrime;
		//1-20 ye kadar olan sayýlar
		//dýþ döngü
		while(counter<400) { 
			isPrime=true;
			counter2=2;
			//üst sayaçtaki sayýya kadar olan sayýlar için
			//iç döngü
			while(counter2<counter) { 
				
				if(counter%counter2==0) {
					isPrime=false;
					 break;
				}
				counter2++;
			}
			if(isPrime) {
				System.out.println("Prime Number:"+counter);
			}
			counter++;
		}

	}

}
