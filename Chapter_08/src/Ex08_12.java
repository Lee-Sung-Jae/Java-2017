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
				System.out.printf("%c �ڵ����� �ͳο� ��\n", carName);
				stack[top++] = carName++;
				break;

			case 2:
				stack[top--] = carName--;
				System.out.printf("%c �ڵ����� �ͳο��� ����\n", carName);
				break;

			case 3:
				System.out.printf("���� �ͳο� %d�밡 ����.\n", top);
				break;
				
			default:
				System.out.printf("�߸� �� �Է��Դϴ�.");
			}
		}
		
		System.out.printf("���α׷��� �����մϴ�.");
	}

}
