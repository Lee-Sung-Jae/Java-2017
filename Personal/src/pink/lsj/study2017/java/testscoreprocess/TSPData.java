package pink.lsj.study2017.java.testscoreprocess;

public class TSPData {
	private static String[] students;
	private static double[][] scores;
	private static int[][] rankings;
	private static int index = 0;

	protected TSPData(int studentsCount, int subjectsCount) {
		students = new String[studentsCount];
		scores = new double[studentsCount][subjectsCount + 2];
		rankings = new int[studentsCount][subjectsCount + 1];
	}

	protected static String[][] getStudent(int student) {
		String[] scoresStrArr = new String[scores[student].length];
		for (int i = 0; i < scores[student].length; i++) {
			scoresStrArr[i] = String.format("%.2f", scores[student][i]);
		}

		String[] rankingsStrArr = new String[rankings[student].length];
		for (int i = 0; i < rankings[student].length; i++) {
			rankingsStrArr[i] = String.format("%d", rankings[student][i]);
		}

		return new String[][] {
			{ students[student] }, scoresStrArr, rankingsStrArr
		};
	}

	protected static void addStudent(String name) {
		students[index++] = name;
	}

	protected static void setScores(int student, double[] scoresArr) {
		scores[student] = scoresArr;
		processScore(student);
		processRanking();
	}

	protected static int getIndex() {
		return index;
	}

	private static void processScore(int student) {
		double[] score = scores[student];
		score[score.length - 2] = 0;
		for (int i = 0; i < score.length - 2; i++) {
			score[score.length - 2] += score[i];
		}
		score[score.length - 1] = score[score.length - 2] / (score.length - 2);
	}

	private static void processRanking() {
		for (int i = 0; i < students.length; i++) {
			for (int o = 0; o < rankings[0].length; o++) {
				int rankingTmp = 1;
				for (int p = 0; p < students.length; p++) {
					if (i == p)
						continue;
					if (scores[i][o] < scores[p][o])
						rankingTmp++;
				}
				rankings[i][o] = rankingTmp;
			}
		}
	}

}
