public class add1to100Odd {

	public static void main(String[] args) {
		int result = 0;

		for(int i = 1; i <= 100; i += 2)
			result += i;

		System.out.println(result);
	}

}
