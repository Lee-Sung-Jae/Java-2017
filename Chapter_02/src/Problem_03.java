import java.util.Scanner;
import java.io.IOException;

public class Problem_03 {

	public static void main(String[] args) throws IOException {
		int a, b, result;
		char k;

		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 계산 할 값을 입력합니다. => ");
		a = s.nextInt();

		System.out.print("+ - * / % => ");
		k = (char) System.in.read();

		System.out.print("두번째 계산 할 값을 입력합니다. => ");
		b = s.nextInt();

		switch(k) {
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
				if(b != 0) {
					result = a / b;
					System.out.println(a + " / " + b + " = " + result);
				} else
					System.out.println("0으로 나눌 수 없습니다!");

			case '%':
				if(b != 0) {
					result = a % b;
					System.out.println(a + " % " + b + " = " + result);
				} else
					System.out.println("0으로 나눌 수 없습니다!");
		}

	}

}
