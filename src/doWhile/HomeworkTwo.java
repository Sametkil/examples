package doWhile;

public class HomeworkTwo {

	public static void main(String[] args) {
		int counter=2;
		int counter2=2;
		boolean isPrime;
		//1-20 ye kadar olan say�lar
		//d�� d�ng�
		while(counter<400) { 
			isPrime=true;
			counter2=2;
			//�st saya�taki say�ya kadar olan say�lar i�in
			//i� d�ng�
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
