import java.util.Date;

public class DailyQuest1 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		
		System.out.printf("���� �ð� : %s\n\n", date.toString());
		
		if(hour < 7 || hour > 21) {
			System.out.printf("���� ������...\n");
		} else if(hour < 8) {
			System.out.printf("���� � �غ���...");
		} else if(hour < 9) {
			System.out.printf("���� ���...");
		} else if(hour < 13) {
			System.out.printf("���� ���� ���� ������...");
		} else if(hour < 14) {
			System.out.printf("���� ���� �Ļ���...");
		} else if(hour < 17) {
			System.out.printf("���� ���� ���� ������...");
		} else if(hour < 21) {
			System.out.printf("���� ���� ����� ������...");
		} else if(hour < 23) {
			System.out.printf("���� ������ ������...");
		}
	}

}
