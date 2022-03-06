package doWhile;

public class ExampleThree {
	// 20 -35 sayýlarýn 
	//25-30 arasý dahil edilmeden deðer ortalamasýný bulun
	public static void main(String[] args) {
		int counter=0;
		int number=20;
		float sum=0;
		float average=0;
		
		do {
			if(number<25 || number>30) {
			   counter++;
			   sum+=number;
			}
			
			/*
			 * if(number>=25 && number<=30){
			 * continue;
			 * }
			 * sum+=number;
			 */
			number++;
		}while(number<=35);
		
		average= sum/counter;
		System.out.println("Average : "+ average);
		
	}

}
