public class Ex08_11 {

	public static void main(String[] args) {
		char[] stack = new char[5];
		int top = 0;
		
		stack[top] = 'A';
		System.out.printf("stack[%d]�� %c�� ��\n", top, stack[top++]);
		
		stack[top] = 'B';
		System.out.printf("stack[%d]�� %c�� ��\n", top, stack[top++]);
		
		stack[top] = 'C';
		System.out.printf("stack[%d]�� %c�� ��\n", top, stack[top++]);
	}

}
