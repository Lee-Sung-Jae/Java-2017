import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		int a;

		Scanner s = new Scanner(System.in);

		System.out.printf("������ �Է� : ");
		a = s.nextInt();

		if ((a % 2) == 0) {
			System.out.printf("�Է¹��� �� %d(��)�� ¦���Դϴ�.", a);
		} else {
			System.out.printf("�Է¹��� �� %d(��)�� Ȧ���Դϴ�.", a);
		}
	}

}
