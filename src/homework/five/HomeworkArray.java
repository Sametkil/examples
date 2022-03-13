import java.util.Scanner;

public class HomeworkArray {

	public static void main(String[] args) {
		System.out.println("Sonuc : "+
	calculateAverage(setValues()));
	}
	
	public static int[] setValues() {
		Scanner scanner = new Scanner(System.in);
		int[] numberArray = new int[5];
		for(int i=0;i<numberArray.length;i++) {
			System.out.println((i+1)+".Sayi giriniz");
			numberArray[i]=scanner.nextInt();
		}
		return numberArray;
	}
	
	public static float calculateAverage(int[] array) {
		float average=0;
		for(int i=0;i<array.length;i++) {
			average+=array[i];
		}
		
		return average/array.length;
	}

}
