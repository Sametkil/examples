package homework.six;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMovieSeats {
	private final static String[][] movieSeats = new String[][] {
			{ "A1", "A2", "A3", "A4", "A5", "A6" },
			{ "B1", "B2", "B3", "B4", "B5", "B6" }, 
			{ "C1", "C2", "C3", "C4", "C5", "C6" },
			{ "D1", "D2", "D3", "D4", "D5", "D6" }
			};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		print();
		System.out.println("Lutfen satin almak istediginiz koltugu giriniz:");
		String seatNumber = scanner.next();
		setSeat(seatNumber);
		print();

	}
	
	public static void setSeat(String seatNumber){
		for (int i=0;i<movieSeats.length;i++){
			int index = Arrays.binarySearch(movieSeats[i], seatNumber);
			if(index>0){
				movieSeats[i][index]="burak";
				break;
			}
		}
	}
	
	public static void print(){
		for (int i=0;i<movieSeats.length;i++){
			for(int j=0;j<movieSeats[i].length;j++){
				System.out.print(movieSeats[i][j]+" ");
			}
			System.out.println();
		}
	}

}
