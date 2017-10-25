import java.util.Scanner;

public class MovieSeatSelector {

	public static void main(String[] args) {
		boolean[][] seats = new boolean[11][10];
		int selectMenu = 0, row, col;
		Scanner input = new Scanner(System.in);
		String selectSeat;

		while (selectMenu != 4) {
			System.out.printf("<1> 예매 <2> 취소 <3> 목록 <4> 종료\n선택 : ");
			selectMenu = input.nextInt();
			input.nextLine();

			switch (selectMenu) {
			case 1:
				System.out.printf("현재 예매 상황\n");
				listSeats(seats);

				System.out.printf("예매 할 좌석 입력 ('A 1' 형식) : ");
				selectSeat = input.nextLine();
				row = (int) selectSeat.charAt(0) - 65;
				col = (int) selectSeat.charAt(2) - 49;

				if (col == 0 && (int) selectSeat.charAt(3) == 48)
					col = 9;

				if (row < 0 || row > 10 || col < 0 || col > 10)
					System.out.printf("입력이 잘못되었습니다! 'A 1'과 같은 형식에 맞추어 작성해 주세요.\n");
				else {
					if (seats[row][col])
						System.out.printf("선택하신 좌석은 이미 예매 되었습니다! 다른 좌석을 예매해주세요.\n");
					else {
						seats[row][col] = true;
						System.out.printf("%c행 %d열 좌석을 예매하셨습니다!\n", (char) row + 65, col + 1);
					}
				}
				break;

			case 2:
				System.out.printf("현재 예매 상황\n");
				listSeats(seats);

				System.out.printf("취소 할 좌석 입력 ('A 1' 형식) : ");
				selectSeat = input.nextLine();
				row = (int) selectSeat.charAt(0) - 65;
				col = (int) selectSeat.charAt(2) - 49;

				if (col == 0 && (int) selectSeat.charAt(3) == 48)
					col = 9;

				if (row < 0 || row > 10 || col < 0 || col > 10)
					System.out.printf("입력이 잘못되었습니다! 'A 1'과 같은 형식에 맞추어 작성해 주세요.\n");
				else {
					if (seats[row][col])
						System.out.printf("선택하신 좌석은 예매 되어있지 않습니다! 입력을 다시 한번 확인해주세요.\n");
					else {
						seats[row][col] = false;
						System.out.printf("%c행 %d열 좌석을 취소하셨습니다!\n", (char) row + 65, col + 1);
					}
				}
				break;

			case 3:
				System.out.printf("현재 예매 상황\n");
				listSeats(seats);
				break;

			case 4:
				System.out.printf("프로그램을 종료합니다.\n");
				break;

			default:
				System.out.printf("잘못 된 입력입니다!\n");
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
