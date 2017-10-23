public class Ex08_06 {

	public static void main(String[] args) {
		int aa[] = { 10, 20, 30, 40, 50 };
		int count, size;
		
		count = aa.length;
		size = count * Integer.BYTES;

		System.out.printf("%d\n", count); // This prints 5
		System.out.printf("%d", size); // This prints 20
	}

}
