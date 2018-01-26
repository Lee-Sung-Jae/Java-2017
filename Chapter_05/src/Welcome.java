import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
		Date date = new Date();
		int currentHour = date.getHours();

		if(currentHour <= 11)
			System.out.println("아침!");
		else if(currentHour <= 15)
			System.out.println("점심!");
		else if(currentHour <= 20)
			System.out.println("저녁!");
		else
			System.out.println("밤!");
	}

}
