import java.util.Scanner;

public class Problem_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է� ==> ");
		String str = s.nextLine();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.printf("\n");
	}

}
