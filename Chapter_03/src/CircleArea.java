import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("���� ������ : ");
		double input = s.nextDouble();
		
		double circleSize = input * input * 3.14;
		System.out.printf("�������� %f�� ���� ���̴� %f�Դϴ�.", input, circleSize);		
	}

}
