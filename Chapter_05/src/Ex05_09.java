import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("1 ~ 4 중에서 선택 : ");
		a = s.nextInt();
		
		switch(a) {
		case 1:
			System.out.printf("1을 선택했다!\n");
			break;
		case 2:
			System.out.printf("2를 선택했다!\n");
			break;
		case 3:
			System.out.printf("3을 선택했다!\n");
			break;
		case 4:
			System.out.printf("4를 선택했다!\n");
			break;
		default:
			System.out.printf("이게 뭔 헛소리야!\n");
		}
		
	}

}
