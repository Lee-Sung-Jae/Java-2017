import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper1 {

	public static void main(String[] args) {
		char board[][] = new char[10][10];
		boolean mine[][] = new boolean[10][10];

		for (int i = 0; i < 10; i++)
			for (int o = 0; o < 10; o++)
				board[i][o] = '?';

		for (int i = 0; i < 10; i++)
			for (int o = 0; o < 10; o++)
				if (Math.random() < 0.2)
					mine[i][o] = true;

		seeBoard(board);
		while (true) {
			int[] input = userInput(board);
			int openResult = openBox(input, mine);
			if(openResult == 1) {
				System.out.printf("You pressed mine!");
				// gameEnd(board, mine);
				break;
			}
		}
	}

	private static void seeBoard(char[][] board) {
		System.out.printf(" 1234567890\n");

		for (int i = 0; i < 10; i++) {
			System.out.printf("%c", (int) i + 65);

			for (int o = 0; o < 10; o++) {
				System.out.printf("%c", board[i][o]);
			}

			System.out.printf("\n");
		}
	}

	private static int mineCount(boolean[][] mine, int row, int col) {
		int mines = 0;

		for (int i = -1; i < 2; i++)
			for (int o = -1; o < 2; o++)
				if (mine[row + i][col + o])
					mines++;

		return mines;
	}

	private static int[] userInput(char[][] board) {
		int row, col;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.nextLine();
			row = ((int) input.charAt(0)) - 65;
			col = ((int) input.charAt(1)) - 48;

			if (row < 0 || row > 9 || col < 0 || col > 9)
				System.out.printf("Wrong input");
			else {
				break;
			}
		}

		scanner.close();
		return new int[] { row, col };
	}

	private static int openBox(int[] loc, boolean[][] mine) {
		int row = loc[0], col = loc[1];

		if (mine[row][col])
			return 1;
		else
			return 0;
	}

}
