import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		int m, n, v = 1;
		Scanner s = new Scanner(System.in);

		System.out.print("�� ���� : ");
		m = s.nextInt();
		System.out.print("�� ���� : ");
		n = s.nextInt();

		int[][] aa = new int[m][n];

		System.out.printf("\n");

		for (int i = 0; i < m; i++)
			for (int o = 0; o < n; o++) {
				aa[i][o] = v++;
				System.out.printf("%d�� %d�� == %d" + ((o < n - 1) ? ",\t" : "\n"), i + 1, o + 1, aa[i][o]);
			}

	}

}
