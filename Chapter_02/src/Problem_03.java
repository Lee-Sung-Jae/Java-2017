import java.util.Scanner;
import java.io.IOException;

public class Problem_03 {

	public static void main(String[] args) throws IOException {
		int a, b, result;
		char k;

		Scanner s = new Scanner(System.in);

		System.out.print("ù��° ��� �� ���� �Է��մϴ�. => ");
		a = s.nextInt();

		System.out.print("+ - * / % => ");
		k = (char) System.in.read();

		System.out.print("�ι�° ��� �� ���� �Է��մϴ�. => ");
		b = s.nextInt();

		switch (k) {
		case '+':
			result = a + b;
			System.out.println(a + " + " + b + " = " + result);

		case '-':
			result = a - b;
			System.out.println(a + " - " + b + " = " + result);

		case '*':
			result = a * b;
			System.out.println(a + " * " + b + " = " + result);

		case '/':
			if (b != 0) {
				result = a / b;
				System.out.println(a + " / " + b + " = " + result);
			} else
				System.out.println("0���� ���� �� �����ϴ�!");

		case '%':
			if (b != 0) {
				result = a % b;
				System.out.println(a + " % " + b + " = " + result);
			} else
				System.out.println("0���� ���� �� �����ϴ�!");
		}

	}

}
