import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		final int need = 1000;
		int got, bonus;

		Scanner s = new Scanner(System.in);

		System.out.printf("������ �Է� (���� : ����) : ");
		got = s.nextInt();

		if (got >= need) {
			System.out.printf("��ǥ ���� �޼�!\n");
			if (got > need) {
				bonus = (got - need) / 10;
				System.out.printf("��ǥ ������ �ʰ��Ͽ��� ������ ������ %d������ ���޵˴ϴ�.\n", bonus);
			}
		} else {
			System.out.printf("��ǥ ���� �޼� ����..\n");
		}
	}

}
