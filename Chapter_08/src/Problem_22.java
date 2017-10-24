import java.util.Scanner;

public class Problem_22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] queue = new char[5];
		char carName = 'A';
		int rear = 0, select = 0;

		while (select != 3) {
			System.out.printf("<1> �ֱ� <2> ���� <3> ����\n�Է� : ");
			select = s.nextInt();

			switch (select) {
			case 1:
				if (rear > 4) {
					System.out.printf("���� �ͳ��� ���� ���� �� �̻� ���ο� ������ ��� �� �� �����ϴ�!\n");
				} else {
					System.out.printf("%c ������ �ͳο� �����ϴ�.\n", carName);
					queue[rear++] = carName++;
				}
				break;

			case 2:
				if (rear < 1) {
					System.out.printf("���� �ͳ��� ����־� �� �̻� ���� ������ �����ϴ�!\n");
				} else {
					System.out.printf("%c ������ �ͳο��� ���Խ��ϴ�.\n", queue[0]);
					queue[0] = ' ';
					for (int i = 0; i < 4; i++)
						queue[i] = queue[i + 1];
					rear--;
				}
				break;

			case 3:
				System.out.printf("���� �ͳο� %d���� ������ �ֽ��ϴ�.\n", rear);
				break;

			default:
				System.out.printf("�߸� �� �Է��Դϴ�.");
			}
		}
	}

}
