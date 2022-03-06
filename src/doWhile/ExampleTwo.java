package doWhile;

public class ExampleTwo {

	public static void main(String[] args) {
		int number=1;
		int sum=0;
		do {
			sum+=number;
			number++;
		}while(number<6);
		
		System.out.println("Sum: "+ sum);

	}

}
