import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char carName = 'A';
		char[] stack = new char[5];
		int top = 0, select = 0;

		while (select != 3) {
			System.out.printf("<1> �ֱ� <2> ���� <3> ����\n�Է� : ");
			select = s.nextInt();

			switch (select) {
			case 1:
				if (top > 4) {
					System.out.printf("���� �ͳ��� ���� ���� �� �̻� ���ο� ������ ��� �� �� �����ϴ�!\n");
				} else {
					System.out.printf("%c ������ �ͳο� �����ϴ�.\n", carName);
					stack[top++] = carName++;
				}
				break;

			case 2:
				if (top < 1) {
					System.out.printf("���� �ͳ��� ����־� �� �̻� ���� ������ �����ϴ�!\n");
				} else {
					stack[--top] = ' ';
					System.out.printf("%c ������ �ͳο��� ���Խ��ϴ�.\n", --carName);
				}
				break;

			case 3:
				System.out.printf("���� �ͳο� %d���� ������ �ֽ��ϴ�.\n", top);
				break;

			default:
				System.out.printf("�߸� �� �Է��Դϴ�.");
			}
		}

		System.out.printf("���α׷��� �����մϴ�.");
	}

}
