import java.util.Scanner;

public class MovieSeatSelector {

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

			System.out.printf("\n예매 할 좌석의 번호 입력(종료 : -1) : ");
			number = input.nextInt();

			if (number == -1)
				break;

			if (seats[number - 1] == 1)
				System.out.printf("선택하신 좌석은 이미 예매 되었습니다! 다른 좌석을 예매해주세요.\n");
			else {
				seats[number - 1] = 1;
				System.out.printf("%d번 좌석을 예매하셨습니다!\n", number);
			}
		}
	}

}
