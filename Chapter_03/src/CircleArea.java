import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("원의 반지름 : ");
		double input = s.nextDouble();
		
		double circleSize = input * input * 3.14;
		System.out.printf("반지름이 %f인 원의 넓이는 %f입니다.", input, circleSize);		
	}

}
