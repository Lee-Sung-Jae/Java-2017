package pink.lsj.study2017.java.testscoreprocess;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestScoreProcess {
	private static TSPProperties properties;
	private static TSPData data;
	private static Scanner scanner = new Scanner(System.in);
	private static String[] subjects;
	private static int studentsCount;

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
		studentsCount = NumberProcess.parseInt(properties.get("studentsCount"))[1];
		data = new TSPData(studentsCount, subjects.length);

		getDataInput();
		printResult();

		scanner.close();
	}

	private static void getConfigureInput() {
		if(!properties.isSet("studentsCount")) {
			while (true) {
				System.out.printf("Enter students count : ");
				int[] numbersTmp = NumberProcess.parseInt(scanner.nextLine());
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
		for (int i = 0; i < studentsCount; i++) {
			System.out.printf("Enter student name (#%d) : ", i + 1);
			data.addStudent(scanner.nextLine());

			scoresInput: while (true) {
				System.out.printf("Enter test scores with following format (%s) : ", properties.get("subjectsStr"));
				String[] scoresTmp = scanner.nextLine().split(" ");
				double[] scoresTmpArr = new double[scoresTmp.length + 2];
				if (scoresTmp.length != subjects.length) {
					System.out.printf("Wrong input! Please check your input.\n");
					continue;
				} else {
					for (int o = 0; o < scoresTmp.length; o++) {
						if (NumberProcess.parseDouble(scoresTmp[o])[0] == 1) {
							scoresTmpArr[o] = NumberProcess.parseDouble(scoresTmp[o])[1];
						} else {
							System.out.printf("Entered score \"%s\" (%s) is incorrect score! Please check your input.\n",
									scoresTmp[o], subjects[o]);
							continue scoresInput;
						}
					}
					data.setScores(i, scoresTmpArr);
					break;
				}
			}
		}
	}

	private static void printResult() {
		for (int i = 0; i < data.getIndex(); i++) {
			String[][] studentData = data.getStudent(i);
			System.out.printf("Student %s (#%d) scores\n", studentData[0][0], i + 1);
			for (int o = 0; o < subjects.length; o++) {
				System.out.printf("\t%s(#%s) : %s\n", subjects[o], studentData[2][o], studentData[1][o]);
			}
			System.out.printf("\tOverall(#%s) (Average) : %s (%s)\n",
					studentData[2][subjects.length], studentData[1][subjects.length], studentData[1][subjects.length + 1]);
			System.out.printf("\n");
		}
	}
}
