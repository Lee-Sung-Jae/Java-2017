import java.util.Scanner;

public class addAtoBwithC {

	public static void main(String[] args) {
		int start, end, add, result = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("���� �� �Է�: ");
		start = s.nextInt();

		System.out.print("���� �� �Է�: ");
		end = s.nextInt();

		System.out.print("���� �� �Է�: ");
		add = s.nextInt();

		for (int i = start; i <= end; i += add)
			result += i;

		System.out.println(result);
	}

}
