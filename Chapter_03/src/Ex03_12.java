
public class Ex03_12 {

	public static void main(String[] args) {
		char a, b, c, d, e;

		a = 'A';
		System.out.printf("%c\t", a);
		System.out.printf("%d\n", (int) a);

		b = 'a';
		c = (char) (b + 1);
		System.out.printf("%c\t", b);
		System.out.printf("%c\n", c);

		d = 90;
		System.out.printf("%c\n", d);

		d = '°¡';
		e = (char) (d + 1);
		System.out.printf("%d\t", (int) d);
		System.out.printf("%c\n", e);

		System.out.printf("\n");

		for (int i = 0; i < 128; i++) {
			System.out.printf("%d\t%c\n", i, (char) i);
		}
	}

}
