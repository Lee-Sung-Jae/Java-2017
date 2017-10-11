import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		a = s.nextInt();

		System.out.print("두번째 정수 입력 : ");
		b = s.nextInt();

		System.out.printf("%d + %d는 %d입니다.", a, b, a + b);
	}

}
