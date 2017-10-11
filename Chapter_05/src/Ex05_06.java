import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		int a;

		Scanner s = new Scanner(System.in);

		System.out.printf("정수를 입력 : ");
		a = s.nextInt();

		if ((a % 2) == 0) {
			System.out.printf("입력받은 수 %d(은)는 짝수입니다.", a);
		} else {
			System.out.printf("입력받은 수 %d(은)는 홀수입니다.", a);
		}
	}

}
