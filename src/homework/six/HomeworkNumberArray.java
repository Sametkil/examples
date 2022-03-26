package homework.six;

public class HomeworkNumberArray {

	public static void main(String[] args) {
		int[][] numberArray2D = {{1,3,5},{2,4,6},{7,8,9}};
		for (int i=0;i<numberArray2D.length;i++){
			for(int j=0;j<numberArray2D[i].length;j++){
				System.out.print(numberArray2D[i][j]);
			}
			System.out.println();
		}

	}

}
