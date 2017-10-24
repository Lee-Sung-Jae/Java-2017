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
				System.out.printf("%c 자동차가 터널에 들어감\n", carName);
				stack[top++] = carName++;
				break;

			case 2:
				stack[top--] = carName--;
				System.out.printf("%c 자동차가 터널에서 나옴\n", carName);
				break;

			case 3:
				System.out.printf("현재 터널에 %d대가 있음.\n", top);
				break;
				
			default:
				System.out.printf("잘못 된 입력입니다.");
			}
		}
		
		System.out.printf("프로그램을 종료합니다.");
	}

}
