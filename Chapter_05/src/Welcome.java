import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
		Date date = new Date();
		int currentHour = date.getHours();
				
		if(currentHour <= 11) System.out.println("��ħ!");
		else if(currentHour <= 15) System.out.println("����!");
		else if(currentHour <= 20) System.out.println("����!");
		else System.out.println("��!");
	}

}
