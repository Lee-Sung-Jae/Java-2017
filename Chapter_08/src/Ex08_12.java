import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char carName = 'A';
		char[] stack = new char[5];
		int top = 0, select = 0;

		while (select != 3) {
			System.out.printf("<1> 넣기 <2> 빼기 <3> 종료\n입력 : ");
			select = s.nextInt();

			switch (select) {
			case 1:
				if (top > 4) {
					System.out.printf("현재 터널이 가득 차서 더 이상 새로운 차량이 들어 갈 수 없습니다!\n");
				} else {
					System.out.printf("%c 차량이 터널에 들어갔습니다.\n", carName);
					stack[top++] = carName++;
				}
				break;

			case 2:
				if (top < 1) {
					System.out.printf("현재 터널이 비어있어 더 이상 나갈 차량이 없습니다!\n");
				} else {
					stack[--top] = ' ';
					System.out.printf("%c 차량이 터널에서 나왔습니다.\n", --carName);
				}
				break;

			case 3:
				System.out.printf("현재 터널에 %d대의 차량이 있습니다.\n", top);
				break;

			default:
				System.out.printf("잘못 된 입력입니다.");
			}
		}

		System.out.printf("프로그램을 종료합니다.");
	}

}
