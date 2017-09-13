import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
		Date date = new Date();
		int currentHour = date.getHours();
				
		if(currentHour <= 11) System.out.println("¾ÆÄ§!");
		else if(currentHour <= 15) System.out.println("Á¡½É!");
		else if(currentHour <= 20) System.out.println("Àú³á!");
		else System.out.println("¹ã!");
	}

}
