import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int s[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }, value, index = -1;
		Scanner input = new Scanner(System.in);

		System.out.printf("�˻� �� ���� �Է� : ");
		value = input.nextInt();

		for (int i = 0; i < s.length; i++) {
			if (s[i] == value)
				index = i;
		}
		
		if(index < s.length && index >= 0)
			System.out.printf("�Է��Ͻ� �� %d�� �迭�� %d ��ġ�� �ֽ��ϴ�.", value, index);
	}

}
