package pink.lsj.study2017.java.personal1;

public class UseClass1 {

	public static void main(String[] args) {
		Method1 method1 = new Method1();
		System.out.println(method1.protectedMethod(123)); // In same package so can access
	}

}
