package pink.lsj.study2017.java.test20171205;

import java.util.Scanner;

public class TestScoreProcess {

	public static void main(String[] args) {
		int studentsCount = 2;
		String subjectsStr = "Korean English Math P.E. Programming";
		String[] subjects = subjectsStr.split(" ");

		Scanner sc = new Scanner(System.in);

		String[] students = new String[studentsCount];
		// Add 1 to Overall ranking.
		int[][] ranking = new int[students.length][subjects.length + 1];
		// Add 2 to Overall score, and average.
		double[][] scores = new double[students.length][subjects.length + 2];

		// User input
		for (int i = 0; i < students.length; i++) {
			System.out.printf("Enter student name (#%d) : ", i + 1);
			students[i] = sc.nextLine();

			while (true) {
				String[] scoresTmp; // Temporary variable
				System.out.printf("Enter test scores with following format (%s) : ", subjectsStr);
				scoresTmp = sc.nextLine().split(" ");
				if (scoresTmp.length != subjects.length) {
					System.out.printf("Wrong input! Please check your input.\n");
					continue;
				} else {
					for (int o = 0; o < scoresTmp.length; o++)
						scores[i][o] = Double.parseDouble(scoresTmp[o]);
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

}
