import java.util.Scanner;

public class MonthDaysCount {

	public static void main(String[] args) {
		int month, days;
		Scanner input = new Scanner(System.in);

		System.out.printf("�ϼ��� �ñ��� ��(��¥) �Է� : ");
		month = input.nextInt();

		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		default:
			days = 0;
			break;
		}

		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month, days);
	}

}
