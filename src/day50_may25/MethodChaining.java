package day50_may25;

public class MethodChaining {

	public static void main(String[] args) {

		methodA();

	}

	public static void methodA() {

		methodB();

		System.out.println("A called");
	}

	public static void methodB() {

		System.out.println("B called");
		methodC();
	}

	public static void methodC() {
		// Step
		System.out.println("C called");
	}
}
