package pink.lsj.study2017.java.personal1;

public class Method1 {

	public static void main(String[] args) {
		System.out.println("A");
	}

	public static int intPlus(int one, int two) {
		return one + two;
	}

	public static int intMinus(int one, int two) {
		return one - two;
	}

	public static int intMultiply(int one, int two) {
		return one * two;
	}

	public static int intDivision(int one, int two) {
		return one / two;
	}

	public static int intRemainder(int one, int two) {
		return one % two;
	}

	protected static int protectedMethod(int input) {
		return input;
	}

	private static int privateMethod(int input) {
		return input;
	}
}
