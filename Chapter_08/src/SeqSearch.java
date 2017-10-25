import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int s[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }, value, index = -1;
		Scanner input = new Scanner(System.in);

		System.out.printf("검색 할 정수 입력 : ");
		value = input.nextInt();

		for (int i = 0; i < s.length; i++) {
			if (s[i] == value)
				index = i;
		}
		
		if(index < s.length && index >= 0)
			System.out.printf("입력하신 값 %d은 배열의 %d 위치에 있습니다.", value, index);
	}

}
