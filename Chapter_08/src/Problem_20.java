public class Problem_20 {

	public static void main(String[] args) {
		int[][] multiTable = new int[9][9];

		for(int i = 0; i < 9; i++)
			for(int o = 0; o < 9; o++) {
				multiTable[i][o] = (i + 1) * (o + 1);
				System.out.printf("%d * %d = %d" + ((o < 8) ? "\t" : "\n"), (i + 1), (o + 1), multiTable[i][o]);
			}

	}

}
