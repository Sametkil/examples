package homework.nine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		MovablePoint movablePoint = new MovablePoint(0, 0);
		String[][] board = init();
		printBoard(board);
		char choose = 0;
	
		while(choose!='q') {
			board[movablePoint.getY()][movablePoint.getX()]="*";
			System.out.println("Choose Direct:");
			choose = scanner.next().charAt(0);
			switch (choose) {
			case 'w':
				movablePoint.moveUp();
				break;
			case 's':
				movablePoint.moveDown();
				break;
			case 'a':
				movablePoint.moveLeft();
				break;
			case 'd':
				movablePoint.moveRight();
				break;
			default:
				System.out.println("Wrong!!!");
				break;
			}
			board[movablePoint.getY()][movablePoint.getX()]="o";
			printBoard(board);
		}

	}
	
	
	public static void printBoard(String[][] board) {
		System.out.println("Print Run:");
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static String[][] init() {
		String[][] board = new String[8][8];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]="*";
			}
		}
		return board;
	}

}
