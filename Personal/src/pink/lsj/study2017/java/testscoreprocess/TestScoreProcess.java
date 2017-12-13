package pink.lsj.study2017.java.testscoreprocess;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestScoreProcess {
	private static TSPProperties properties;
	private static Scanner scanner = new Scanner(System.in);
	private static NumberProcess numberProcess = new NumberProcess();
	private static String[] students, subjects;
	private static double[][] scores;
	private static int[][] rankings;

	public static void main(String[] args) {
		Map<String, String> defaultProperties = new HashMap<>();
		String[] keys = { "studentsCount", "subjectsStr" };
		String[] values = { "10", "Korean English Math P.E. Programming" };
		for (int i = 0; i < keys.length; i++)
			defaultProperties.put(keys[i], values[i]);

		try {
			properties = new TSPProperties(keys, values, "tsp.properties");
			System.out.printf("Properties file found.\n");
		} catch (IOException e) {
			properties = new TSPProperties(keys, values);
		}

		getConfigureInput();

		subjects = properties.get("subjectsStr").split(" ");

		students = new String[NumberProcess.parseInt(properties.get("studentsCount"))[1]];
		scores = new double[students.length][subjects.length + 2];
		rankings = new int[students.length][subjects.length + 1];

		getDataInput();
		processScore();
		processRanking();
		printResult();

		scanner.close();
	}

	private static void getConfigureInput() {
		if(!properties.isSet("studentsCount")) {
			while (true) {
				System.out.printf("Enter students count : ");
				int[] numbersTmp = numberProcess.parseInt(scanner.nextLine());
				if (numbersTmp[0] == 1) {
					properties.set("studentsCount", Integer.toString(numbersTmp[1]));
					break;
				} else {
					System.out.printf("Entered value is incorrect number! Please check your input.\n");
				}
			}
		}

		if(!properties.isSet("subjectsStr")) {
			System.out.printf("Enter subjects list division by whitespace(U+0020) (Blank to default setting, \"%s\") : ",
					properties.get("subjectsStr"));
			if ((properties.set("subjectsStr", scanner.nextLine())).isEmpty()) {
				System.out.printf("Blank input detected. Using default settings...\n");
				properties.setToDefault("subjectsStr");
			}
		}
	}

	private static void getDataInput() {
		for (int i = 0; i < students.length; i++) {
			System.out.printf("Enter student name (#%d) : ", i + 1);
			students[i] = scanner.nextLine();

			scoresInput: while (true) {
				System.out.printf("Enter test scores with following format (%s) : ", properties.get("subjectsStr"));
				String[] scoresTmp = scanner.nextLine().split(" ");
				if (scoresTmp.length != subjects.length) {
					System.out.printf("Wrong input! Please check your input.\n");
					continue;
				} else {
					for (int o = 0; o < scoresTmp.length; o++) {
						if (numberProcess.parseDouble(scoresTmp[o])[0] == 1) {
							scores[i][o] = numberProcess.parseDouble(scoresTmp[o])[1];
						} else {
							System.out.printf("Entered score \"%s\" (%s) is incorrect score! Please check your input.\n",
									scoresTmp[o], subjects[o]);
							continue scoresInput;
						}
					}
					break;
				}
			}
		}
	}

	private static void processScore() {
		for (int i = 0; i < students.length; i++) {
			scores[i][subjects.length] = 0;
			for (int o = 0; o < subjects.length; o++) {
				scores[i][subjects.length] += scores[i][o];
			}
			scores[i][subjects.length + 1] = scores[i][subjects.length] / subjects.length;
		}
	}

	private static void processRanking() {
		for (int i = 0; i < students.length; i++) {
			for (int o = 0; o < subjects.length + 1; o++) {
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

	private static void printResult() {
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%s\n", students[i]);
			for (int o = 0; o < subjects.length; o++) {
				System.out.printf("\t%s(#%d) : %.2f\n", subjects[o], rankings[i][o], scores[i][o]);
			}
			System.out.printf("\tOverall(#%d) (Average) : %.2f (%.2f)\n",
					rankings[i][subjects.length], scores[i][subjects.length], scores[i][subjects.length + 1]);
			System.out.printf("\n");
		}
	}
}
