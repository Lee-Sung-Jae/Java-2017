import java.util.Scanner;

public class MovieSeatSelector {

	public static void main(String[] args) {
		boolean[][] seats = new boolean[11][10];
		int selectMenu = 0, row, col;
		Scanner input = new Scanner(System.in);
		String selectSeat;

		while (selectMenu != 4) {
			System.out.printf("<1> ���� <2> ��� <3> ��� <4> ����\n���� : ");
			selectMenu = input.nextInt();
			input.nextLine();

			switch (selectMenu) {
			case 1:
				System.out.printf("���� ���� ��Ȳ\n");
				listSeats(seats);

				System.out.printf("���� �� �¼� �Է� ('A 1' ����) : ");
				selectSeat = input.nextLine();
				row = (int) selectSeat.charAt(0) - 65;
				col = (int) selectSeat.charAt(2) - 49;

				if (col == 0 && (int) selectSeat.charAt(3) == 48)
					col = 9;

				if (row < 0 || row > 10 || col < 0 || col > 10)
					System.out.printf("�Է��� �߸��Ǿ����ϴ�! 'A 1'�� ���� ���Ŀ� ���߾� �ۼ��� �ּ���.\n");
				else {
					if (seats[row][col])
						System.out.printf("�����Ͻ� �¼��� �̹� ���� �Ǿ����ϴ�! �ٸ� �¼��� �������ּ���.\n");
					else {
						seats[row][col] = true;
						System.out.printf("%c�� %d�� �¼��� �����ϼ̽��ϴ�!\n", (char) row + 65, col + 1);
					}
				}
				break;

			case 2:
				System.out.printf("���� ���� ��Ȳ\n");
				listSeats(seats);

				System.out.printf("��� �� �¼� �Է� ('A 1' ����) : ");
				selectSeat = input.nextLine();
				row = (int) selectSeat.charAt(0) - 65;
				col = (int) selectSeat.charAt(2) - 49;

				if (col == 0 && (int) selectSeat.charAt(3) == 48)
					col = 9;

				if (row < 0 || row > 10 || col < 0 || col > 10)
					System.out.printf("�Է��� �߸��Ǿ����ϴ�! 'A 1'�� ���� ���Ŀ� ���߾� �ۼ��� �ּ���.\n");
				else {
					if (seats[row][col])
						System.out.printf("�����Ͻ� �¼��� ���� �Ǿ����� �ʽ��ϴ�! �Է��� �ٽ� �ѹ� Ȯ�����ּ���.\n");
					else {
						seats[row][col] = false;
						System.out.printf("%c�� %d�� �¼��� ����ϼ̽��ϴ�!\n", (char) row + 65, col + 1);
					}
				}
				break;

			case 3:
				System.out.printf("���� ���� ��Ȳ\n");
				listSeats(seats);
				break;

			case 4:
				System.out.printf("���α׷��� �����մϴ�.\n");
				break;

			default:
				System.out.printf("�߸� �� �Է��Դϴ�!\n");
			}
		}
	}

	private static void listSeats(boolean[][] seats) {
		System.out.printf("   01 02 03 04 05 06 07 08 09 10\n");
		for (int i = 0; i < 11; i++) {
			System.out.printf("%c ", i + 65);

			for (int o = 0; o < 10; o++) {
				System.out.printf(((seats[i][o]) ? "[x]" : "[ ]"));
			}

			System.out.printf("\n");
		}
	}

}
