import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� : ");
		a = s.nextInt();

		System.out.print("�ι�° ���� �Է� : ");
		b = s.nextInt();

		System.out.printf("%d + %d�� %d�Դϴ�.", a, b, a + b);
	}

}
