import java.util.Scanner;

public class MineSweeper1 {

	public static void main(String[] args) {
		char board[][] = {
			{'a','a','a','a','a','a','a','a','a','a'}
		};
		boolean mine[][] = new boolean[10][10];
		
		for(int i = 0; i < 10; i++)
			for(int o = 0; o < 10; o++)
				if(Math.random() < 0.2)
					mine[i][o] = true;
		
		seeBoard(board);
		userInput(board);
	}

	private static void seeBoard(int[][] board) {
		System.out.printf(" 1234567890\n");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%c", (int) i + 65);
			
			for(int o = 0; o < 10; o++) {
				switch(board[i][o]) {
				case 0:
					System.out.printf("*");
					break;
				case 1:
					System.out.printf(mineCount(mine, i, o));
					break;
				case 2:
					System.out.printf("F");
					break;
				default:
					System.out.printf("E");
				}
			}
			
			System.out.printf("\n");
		}	
	}
	
	private static int mineCount(int[][] mine, int i, int o) {
		return 0;
	}

	private static void userInput(int[][] board) {
		Scanner scanner = new Scanner(System.in);
		
		scanner.close();		
	}

}
