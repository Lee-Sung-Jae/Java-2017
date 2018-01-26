import java.util.Scanner;

public class addAtoBwithC {

	public static void main(String[] args) {
		int start, end, add, result = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("시작 값 입력: ");
		start = s.nextInt();

		System.out.print("종료 값 입력: ");
		end = s.nextInt();

		System.out.print("증감 값 입력: ");
		add = s.nextInt();

		for(int i = start; i <= end; i += add)
			result += i;

		System.out.println(result);
	}

}
