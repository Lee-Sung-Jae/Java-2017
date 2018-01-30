package pink.lsj.study2017.java.testscoreprocess;

class TSPData {
	private static String[] students;
	private static double[][] scores;
	private static int[][] rankings;
	private static int index = 0;

	TSPData(int studentsCount, int subjectsCount) {
		students = new String[studentsCount];
		scores = new double[studentsCount][subjectsCount + 2];
		rankings = new int[studentsCount][subjectsCount + 1];
	}

	static int getIndex() {
		return index;
	}

	static void addStudent(String name) {
		students[index++] = name;
	}

	static void setScores(int student, double[] scoresArr) {
		scores[student] = scoresArr;
		processScore(student);
		processRanking();
	}

	static String[][] getStudent(int student) {
		String[] scoresStrArr = new String[scores[student].length];
		for(int scoresIndex = 0; scoresIndex < scores[student].length; scoresIndex++)
			scoresStrArr[scoresIndex] = String.format("%.2f", scores[student][scoresIndex]);

		String[] rankingsStrArr = new String[rankings[student].length];
		for(int rankingsIndex = 0; rankingsIndex < rankings[student].length; rankingsIndex++)
			rankingsStrArr[rankingsIndex] = String.format("%d", rankings[student][rankingsIndex]);

		return new String[][] {{students[student]}, scoresStrArr, rankingsStrArr};
	}

	private static void processScore(int student) {
		double[] score = scores[student];
		score[score.length - 2] = 0;
		for(int scoreIndex = 0; scoreIndex < score.length - 2; scoreIndex++)
			score[score.length - 2] += score[scoreIndex];
		score[score.length - 1] = score[score.length - 2] / (score.length - 2);
	}

	private static void processRanking() {
		for(int studentsIndex = 0; studentsIndex < students.length; studentsIndex++)
			for(int rankingsIndex = 0, rankingTmp = 1; rankingsIndex < rankings[0].length; rankingsIndex++, rankingTmp = 1) {
				for(int p = 0; p < students.length; p++)
					if(studentsIndex != p && scores[studentsIndex][rankingsIndex] < scores[p][rankingsIndex])
						rankingTmp++;
				rankings[studentsIndex][rankingsIndex] = rankingTmp;
			}
	}

}
