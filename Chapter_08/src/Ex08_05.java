public class Ex08_05 {

	public static void main(String[] args) {
		int[] aa = new int[100];
		int[] bb = new int[100];
		int i;

		for(i = 0; i < 100; i++) {
			aa[i] = i * 2;
			System.out.printf("aa[%d] = %d", i, aa[i]);
		}
	}

}
