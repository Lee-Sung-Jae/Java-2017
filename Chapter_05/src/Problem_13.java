import java.util.Scanner;

public class Problem_13 {

	public static void main(String[] args) {
		int a, b;
		char ch;
		Scanner s = new Scanner(System.in);

		System.out.printf("ù��° �� �Է� : ");
		a = s.nextInt();

		System.out.printf("����� ������ �Է� : ");
		ch = s.next().charAt(0);

		System.out.printf("�ι�° �� �Է� : ");
		b = s.nextInt();

		switch(ch) {
		case '+':
			System.out.printf("%d + %d = %d �Դϴ�.\n", a, b, a + b);
			break;
		case '-':
			System.out.printf("%d - %d = %d �Դϴ�.\n", a, b, a - b);
			break;
		case '*':
			System.out.printf("%d * %d = %d �Դϴ�.\n", a, b, a * b);
			break;
		case '/':
			System.out.printf("%d / %d = %f �Դϴ�.\n", a, b, a / (float) b);
			break;
		case '%':
			System.out.printf("%d %% %d = %d �Դϴ�.\n", a, b, a % b);
			break;
		default:
			System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�.\n");
			break;
		}
	}

}