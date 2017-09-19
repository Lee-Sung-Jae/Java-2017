import java.util.Date;

public class DailyQuest1 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		
		System.out.printf("현재 시간 : %s\n\n", date.toString());
		
		if(hour < 7 || hour > 21) {
			System.out.printf("현재 수면중...\n");
		} else if(hour < 8) {
			System.out.printf("현재 등교 준비중...");
		} else if(hour < 9) {
			System.out.printf("현재 등교중...");
		} else if(hour < 13) {
			System.out.printf("현재 오전 수업 수강중...");
		} else if(hour < 14) {
			System.out.printf("현재 점심 식사중...");
		} else if(hour < 17) {
			System.out.printf("현재 오후 수업 수강중...");
		} else if(hour < 21) {
			System.out.printf("현재 도제 예비반 수강중...");
		} else if(hour < 23) {
			System.out.printf("현재 집으로 복귀중...");
		}
	}

}
