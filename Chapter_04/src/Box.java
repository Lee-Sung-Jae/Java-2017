import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		double a, b, size, length;
		Scanner s = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 : ");
		a = s.nextDouble();
		
		System.out.print("직사각형의 세로 : ");
		b = s.nextDouble();
		
		size = a * b;
		length = (a + b) * 2.0;
		
		System.out.printf("가로가 %.1f고 세로가 %.1f인 사각형의 넓이는 %.1f고, 둘레는 %.1f입니다.", a, b, size, length);
	}

}
