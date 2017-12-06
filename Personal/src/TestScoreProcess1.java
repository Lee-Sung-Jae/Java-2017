import java.util.Scanner;

public class TestScoreProcess1 {

	public static void main(String[] args) {
		// Initialize variables
		int studentsCount;
		Scanner sc = new Scanner(System.in);
		String defaultSubjStr = "Korean English Math P.E. Programming";
		String subjectsStr = "";

		// Configure input
		while (true) {
			System.out.printf("Enter students count : ");
			int[] numbersTmp = parseInt(sc.nextLine());
			if (numbersTmp[0] == 1) {
				studentsCount = numbersTmp[1];
				break;
			} else {
				System.out.printf("Entered value is incorrect number! Please check your input.\n");
			}
		}
		System.out.printf("Enter subjects list division by whitespace(U+0020) (Blank to default setting, \"%s\") : ",
				defaultSubjStr);
		if ((subjectsStr = sc.nextLine()).isEmpty()) {
			System.out.printf("Blank input detected. Using default settings...\n");
			subjectsStr = defaultSubjStr;
		}
		String[] subjects = subjectsStr.split(" ");

		// Initialize arrays
		String[] students = new String[studentsCount];
		// Add 1 to Overall ranking.
		int[][] ranking = new int[students.length][subjects.length + 1];
		// Add 2 to Overall score, and average.
		double[][] scores = new double[students.length][subjects.length + 2];

		// User input
		for (int i = 0; i < students.length; i++) {
			System.out.printf("Enter student name (#%d) : ", i + 1);
			students[i] = sc.nextLine();

			scoresInput: while (true) {
				String[] scoresTmp; // Temporary variable
				System.out.printf("Enter test scores with following format (%s) : ", subjectsStr);
				scoresTmp = sc.nextLine().split(" ");
				if (scoresTmp.length != subjects.length) {
					System.out.printf("Wrong input! Please check your input.\n");
					continue;
				} else {
					for (int o = 0; o < scoresTmp.length; o++) {
						if (parseDouble(scoresTmp[o])[0] == 1) {
							scores[i][o] = parseDouble(scoresTmp[o])[1];
						} else {
							System.out.printf(
									"Entered score \"%s\" (%s) is incorrect score! Please check your input.\n",
									scoresTmp[o], subjects[o]);
							continue scoresInput;
						}
					}
					break;
				}
			}
		}

		System.out.printf("\n");

		// Score, overall and average
		for (int i = 0; i < students.length; i++) {
			scores[i][subjects.length] = 0; // To use += to set to 0
			for (int o = 0; o < subjects.length; o++) { // Overall
				scores[i][subjects.length] += scores[i][o];
			}
			scores[i][subjects.length + 1] = scores[i][subjects.length] / subjects.length; // Average
		}

		// Ranking
		for (int i = 0; i < students.length; i++) {
			// To include overall to add 1.
			for (int o = 0; o < subjects.length + 1; o++) {
				int rankingTmp = 1;
				for (int p = 0; p < students.length; p++) {
					if (i == p)
						continue;
					if (scores[i][o] < scores[p][o])
						rankingTmp++;
				}
				ranking[i][o] = rankingTmp;
			}
		}

		// Print result
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%s\n", students[i]);
			for (int o = 0; o < subjects.length; o++) {
				System.out.printf("\t%s(#%d) : %.2f\n", subjects[o], ranking[i][o], scores[i][o]);
			}
			System.out.printf("\tOverall(#%d) (Average) : %.2f (%.2f)\n", ranking[i][subjects.length],
					scores[i][subjects.length], scores[i][subjects.length + 1]);
			System.out.printf("\n");
		}

		// Close scanner
		sc.close();
	}

	private static int[] parseInt(String numberStr) {
		if (numberStr.matches("([^0-9])+") || numberStr.isEmpty()) {
			return new int[] { 0, -1 };
		} else {
			return new int[] { 1, (Integer.parseInt(numberStr)) };
		}
	}

	private static double[] parseDouble(String numberStr) {
		if (numberStr.matches("([^0-9.])+") || numberStr.isEmpty()) {
			return new double[] { 0, -1 };
		} else {
			return new double[] { 1, (Double.parseDouble(numberStr)) };
		}
	}
}
