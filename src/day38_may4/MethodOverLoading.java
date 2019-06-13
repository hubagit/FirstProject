package day38_may4;

public class MethodOverLoading {

	public static void main(String[] args) {

		doSomething();
		doSomething(100);

		// int x = 100L;
		doSomething(100L);

		// long myLong=100;

		doSomething(123d);
		
	}

	public static void doSomething() {
		System.out.println("Do something()");

	}

	public static void doSomething(int x) {
		System.out.println("Do something(int x)");

	}

	public static void doSomething(long x) {
		System.out.println("Do something(long x)");

	}

	public static void doSomething(double x) {
		System.out.println("Do something(double x)");

	}

	

}
