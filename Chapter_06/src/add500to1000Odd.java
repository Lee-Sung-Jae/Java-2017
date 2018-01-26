public class add500to1000Odd {

	public static void main(String[] args) {
		int result = 0;

		for(int i = 501; i <= 1000; i += 2)
			result += 2;

		System.out.println(result);
	}

}
