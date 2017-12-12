import java.util.Scanner;

public class Langer {

	public static void main(String[] args) {
		int first, second, result;

		Scanner s = new Scanner(System.in);

		System.out.printf("첫번째 정수 : ");
		first = s.nextInt();

		System.out.printf("두번째 정수 : ");
		second = s.nextInt();

		if (first > second)
			result = first;
		else
			result = second;

		System.out.printf("두 정수 %d와 %d 중에서 더 큰 수는 %d입니다.", first, second, result);
	}

}
