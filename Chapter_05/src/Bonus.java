import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		final int need = 1000;
		int got, bonus;

		Scanner s = new Scanner(System.in);

		System.out.printf("실적을 입력 (단위 : 만원) : ");
		got = s.nextInt();

		if (got >= need) {
			System.out.printf("목표 실적 달성!\n");
			if (got > need) {
				bonus = (got - need) / 10;
				System.out.printf("목표 실적을 초과하였기 때문에 성과급 %d만원이 지급됩니다.\n", bonus);
			}
		} else {
			System.out.printf("목표 실적 달성 실패..\n");
		}
	}

}
