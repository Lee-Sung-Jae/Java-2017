import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
		int score;
		char result;

		Scanner s = new Scanner(System.in);

		System.out.printf("점수 입력 : ");
		score = s.nextInt();

		if (score >= 90)
			result = 'A';
		else if (score >= 80)
			result = 'B';
		else if (score >= 70)
			result = 'C';
		else if (score >= 60)
			result = 'D';
		else
			result = 'F';

		System.out.printf("%d점은 %c등급입니다.", score, result);
	}

}
