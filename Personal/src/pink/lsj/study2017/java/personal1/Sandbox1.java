package pink.lsj.study2017.java.personal1;

public class Sandbox1 {
	public static void main(String[] args) {
		Main main = new Main();
		main.run(); // `new Main().run();` will works same
		// To run not static method in static method
		System.out.println(new Sandbox1().randomNumber(1, 100));
	}

	private int randomNumber(int min, int max) {
		return (int) (Math.random() * (max - min) + min); // https://stackoverflow.com/q/7922978
	}
}

class Main {
	private int intA = 15;

	public void run() {
		int intA = 10;
		System.out.println(intA); // This prints 10
		System.out.println(this.intA); // This prints 15
		intA = 20;
		System.out.println(intA); // This prints 20
		System.out.println(this.intA); // This prints 15
		this.intA = 128;
		System.out.println(intA); // This prints 20
		System.out.println(this.intA); // This prints 128
	}
}