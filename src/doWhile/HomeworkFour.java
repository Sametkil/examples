package doWhile;

public class HomeworkFour {

	public static void main(String[] args) {
		int counter=2;
		int counter2=2;
		boolean isPrime;
		//1-20 ye kadar olan sayýlar
		//dýþ döngü
		while(counter<20) { 
			isPrime=true;
			counter2=1;
			//üst sayaçtaki sayýya kadar olan sayýlar için
			//iç döngü
			while((counter2+1)<counter) { 
				counter2++;
				if(counter%counter2==0) {
					isPrime=false;
					 continue;//break;
				}
			}
			if(isPrime) {
				System.out.println("Prime Number:"+counter);
			}
			counter++;
		}

	}

}
