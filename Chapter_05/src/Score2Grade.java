import java.util.Scanner;

public class Score2Grade {

	public static void main(String[] args) {
		int score;
		char grade;
		Scanner input = new Scanner(System.in);

		System.out.printf("점수 입력 (최대 100) : ");
		score = input.nextInt();

		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}

		System.out.printf("%d점은 %c등급입니다.\n", score, grade);
	}

}
