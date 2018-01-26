package pink.lsj.study2017.java.testscoreprocess;

import java.io.IOException;
import java.util.Scanner;

public class TestScoreProcess {
	private static final Scanner scanner = new Scanner(System.in);
	private static String[] subjects;
	private static int studentsCount;

	public static void main(String[] args) {
		String properties, defaultProperties = "tsp.properties";
		String[] keys = {"studentsCount", "subjectsStr"};
		String[] values = {"10", "Korean English Math P.E. Programming"};

		System.out.printf("Please enter path to load properties(Blank to don't load, dot to default path(%s)). : ", defaultProperties);
		if(!(properties = scanner.nextLine()).isEmpty()) {
			if(properties.equals(".")) properties = defaultProperties;
			try {
				new TSPProperties(keys, values, properties);
				System.out.println("Properties file found.");
			} catch(IOException e) {
				System.out.printf("Unable to load file from %s! Please check path that you entered, Error message : %s\n", properties, e.getMessage());
				new TSPProperties(keys, values);
			}
		} else new TSPProperties(keys, values);

		getConfigureInput();

		subjects = TSPProperties.get("subjectsStr").split(" ");
		studentsCount = NumberProcess.parseInt(TSPProperties.get("studentsCount"))[1];
		new TSPData(studentsCount, subjects.length);

		getDataInput();
		printResult();
		savePrompt();

		scanner.close();
	}

	private static void getConfigureInput() {
		if(!TSPProperties.isSet("studentsCount")) {
			int[] numbersTmp = new int[] {1, 1};
			while(numbersTmp[0] != 1) {
				System.out.print("Enter students count : ");
				numbersTmp = NumberProcess.parseInt(scanner.nextLine());
				if(numbersTmp[0] == 1) TSPProperties.set("studentsCount", Integer.toString(numbersTmp[1]));
				else System.out.println("Entered value is incorrect number! Please check your input.");
			}
		}

		if(!TSPProperties.isSet("subjectsStr")) {
			System.out.printf("Enter subjects list division by whitespace(U+0020) (Blank to default setting, \"%s\") : ", TSPProperties.get("subjectsStr"));
			if((TSPProperties.set("subjectsStr", scanner.nextLine())).isEmpty()) {
				System.out.println("Blank input detected. Using default settings...");
				TSPProperties.setToDefault("subjectsStr");
			}
		}
	}

	private static void getDataInput() {
		for(int i = 0; i < studentsCount; i++) {
			System.out.printf("Enter student name (#%d) : ", i + 1);
			TSPData.addStudent(scanner.nextLine());

			scoresInput:
			while(true) {
				System.out.printf("Enter test scores with following format (%s) : ", TSPProperties.get("subjectsStr"));
				String[] scoresTmp = scanner.nextLine().split(" ");
				double[] scoresTmpArr = new double[scoresTmp.length + 2];
				if(scoresTmp.length != subjects.length) System.out.println("Wrong input! Please check your input.");
				else {
					for(int o = 0; o < scoresTmp.length; o++) {
						if(NumberProcess.parseDouble(scoresTmp[o])[0] == 1)
							scoresTmpArr[o] = NumberProcess.parseDouble(scoresTmp[o])[1];
						else {
							System.out.printf("Entered score \"%s\" (%s) is incorrect score! Please check your input.\n", scoresTmp[o], subjects[o]);
							continue scoresInput;
						}
					}
					TSPData.setScores(i, scoresTmpArr);
					break;
				}
			}
		}
	}

	private static void printResult() {
		for(int i = 0; i < TSPData.getIndex(); i++) {
			String[][] studentData = TSPData.getStudent(i);
			System.out.printf("Student %s (#%d) scores\n", studentData[0][0], i + 1);
			for(int o = 0; o < subjects.length; o++)
				System.out.printf("\t%s(#%s) : %s\n", subjects[o], studentData[2][o], studentData[1][o]);
			System.out.printf("\tOverall(#%s) (Average) : %s (%s)\n\n", studentData[2][subjects.length], studentData[1][subjects.length], studentData[1][subjects.length + 1]);
		}
	}

	private static void savePrompt() {
		String properties;
		System.out.print("Please enter path to save properties(Blank to don't save). : ");
		if(!(properties = scanner.nextLine()).isEmpty()) {
			try {
				TSPProperties.saveToFile(properties);
				System.out.printf("Successfully saved properties to %s!", properties);
			} catch(IOException e) {
				System.out.printf("Unable to save file to %s! Please check path that you entered, Error message : %s\n", properties, e.getMessage());
			}
		} else System.out.println("Don't saving properties file.");
	}
}
