public class MineSweeper {

	public static void main(String[] args) {
		boolean[][] board = new boolean[10][10];
		
		for(int i = 0; i < 10; i++)
			for(int o = 0; o < 10; o++)
				if(Math.random() < 0.2)
					board[i][o] = true;
		
		for(int i = 0; i < 10; i++) {
			for(int o = 0; o < 10; o++)
				System.out.printf(board[i][o] ? "#" : ".");
			
			System.out.printf("\n");
		}
	}

}
