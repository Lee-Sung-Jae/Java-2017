import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		int monthNumber;
		String month;
		Scanner input = new Scanner(System.in);

		System.out.printf("달(날짜)의 이름 입력 (영어) : ");
		month = input.next();

		switch(month) {
		case "January":
			monthNumber = 1;
			break;
		case "Feruary":
			monthNumber = 2;
			break;
		case "March":
			monthNumber = 3;
			break;
		default:
			monthNumber = 0;
			break;
		}
		
		System.out.printf("%s는 %d월!", month, monthNumber);
	}

}
