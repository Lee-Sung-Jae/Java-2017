import java.util.Scanner;

public class add1toInput {

	public static void main(String[] args) {
		int input, result = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("정수 입력: ");
		input = s.nextInt();

		for(int i = 1; i <= input; i++)
			result += i;

		System.out.println(result);
	}

}
