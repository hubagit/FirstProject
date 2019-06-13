package day38_may4;

public class MethodOverLoading3 {

	public static void main(String[] args) {

		doSomething(4, 3, 4, 5, 6, 8, 9, 0, -1);
		doSomething(4, 3, 4);
		doSomething(4, 3, 4, 5, 6);

		doSomething(5);
		doSomething(5, 10);
	}

	public static void doSomething(int x) {
		System.out.println("Do something(int x)");

	}

	public static void doSomething(int x, int y) {
		System.out.println("Do something(int x, int y)");

	}

	public static void doSomething(int... x) {
		System.out.println("Do something(int... x)");

	}
}
