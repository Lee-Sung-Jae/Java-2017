import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper1 {

	public static void main(String[] args) {
		char board[][] = new char[10][10];
		boolean mine[][] = new boolean[10][10];
		
		for(int i = 0; i < 10; i++)
			for(int o = 0; o < 10; o++)
				board[i][o] = '?';
		
		for(int i = 0; i < 10; i++)
			for(int o = 0; o < 10; o++)
				if(Math.random() < 0.2)
					mine[i][o] = true;
		
		seeBoard(board);
		userInput(board);
	}

	private static void seeBoard(char[][] board) {
		System.out.printf(" 1234567890\n");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%c", (int) i + 65);
			
			for(int o = 0; o < 10; o++) {
				System.out.printf("%c", board[i][o]);
			}
			
			System.out.printf("\n");
		}	
	}
	
	private static int mineCount(int[][] mine, int i, int o) {
		return 0;
	}

	private static void userInput(char[][] board) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String input = new String(scanner.nextLine());
			int row = ((int) input.charAt(0)) - 65, col = ((int) input.charAt(1)) - 48;
			if(row < 0 || row > 9 || col < 0 || col > 9)
				System.out.printf("Wrong input");
			else {
				openBox(board, row, col);
				break;
			}
		}

		scanner.close();
	}
	
	private static int openBox(char[][] board, int i, int o) {
		
		seeBoard(board);
		
		return 0;
	}

}
