import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		double a, b, size, length;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���簢���� ���� : ");
		a = s.nextDouble();
		
		System.out.print("���簢���� ���� : ");
		b = s.nextDouble();
		
		size = a * b;
		length = (a + b) * 2.0;
		
		System.out.printf("���ΰ� %.1f�� ���ΰ� %.1f�� �簢���� ���̴� %.1f��, �ѷ��� %.1f�Դϴ�.", a, b, size, length);
	}

}
