import java.util.Scanner;

public class MovieSeatSelector2 {

	public static void main(String[] args) {
		int[] seats = new int[10];
		int number = 0;
		Scanner input = new Scanner(System.in);

		while (number != -1) {
			System.out.printf("-------------------------------\n");
			for (int i = 0; i < 10; i++)
				System.out.printf("  %d", i + 1);
			System.out.printf("\n-------------------------------\n");
			for (int i = 0; i < 10; i++)
				System.out.printf("  %d", seats[i]);

			System.out.printf("\n���� �� �¼��� ��ȣ �Է�(���� : -1) : ");
			number = input.nextInt();

			if (number == -1)
				break;

			if (seats[number - 1] == 1)
				System.out.printf("�����Ͻ� �¼��� �̹� ���� �Ǿ����ϴ�! �ٸ� �¼��� �������ּ���.\n");
			else {
				seats[number - 1] = 1;
				System.out.printf("%d�� �¼��� �����ϼ̽��ϴ�!\n", number);
			}
		}
	}

}
