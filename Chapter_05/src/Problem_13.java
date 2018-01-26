import java.util.Scanner;

public class Problem_13 {

	public static void main(String[] args) {
		int a, b;
		char ch;
		Scanner s = new Scanner(System.in);

		System.out.printf("첫번째 수 입력 : ");
		a = s.nextInt();

		System.out.printf("계산할 연산자 입력 : ");
		ch = s.next().charAt(0);

		System.out.printf("두번째 수 입력 : ");
		b = s.nextInt();

		switch(ch) {
			case '+':
				System.out.printf("%d + %d = %d 입니다.\n", a, b, a + b);
				break;
			case '-':
				System.out.printf("%d - %d = %d 입니다.\n", a, b, a - b);
				break;
			case '*':
				System.out.printf("%d * %d = %d 입니다.\n", a, b, a * b);
				break;
			case '/':
				System.out.printf("%d / %d = %f 입니다.\n", a, b, a / (float) b);
				break;
			case '%':
				System.out.printf("%d %% %d = %d 입니다.\n", a, b, a % b);
				break;
			default:
				System.out.printf("연산자를 잘못 입력했습니다.\n");
				break;
		}
	}

}