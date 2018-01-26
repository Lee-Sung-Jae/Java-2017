public class Ex08_07 {

	public static void main(String[] args) {
		int[][] aa = new int[3][4];
		int n = 1;

		for(int i = 0; i <= 2; i++)
			for(int o = 0; o <= 3; o++) {
				aa[i][o] = n++;
				System.out.printf("aa[%d][%d] == %2d" + ((o < 3) ? ",\t" : "\n"), i, o, aa[i][o]);

			}

	}

}
