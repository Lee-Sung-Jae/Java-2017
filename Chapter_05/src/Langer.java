import java.util.Scanner;

public class Langer {

	public static void main(String[] args) {
		int first, second, result;

		Scanner s = new Scanner(System.in);

		System.out.printf("ù��° ���� : ");
		first = s.nextInt();

		System.out.printf("�ι�° ���� : ");
		second = s.nextInt();

		if (first > second)
			result = first;
		else
			result = second;

		System.out.printf("�� ���� %d�� %d �߿��� �� ū ���� %d�Դϴ�.", first, second, result);
	}

}
