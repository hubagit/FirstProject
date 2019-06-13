package day38_may4;

public class MethodOverLoading2 {

	public static void main(String[] args) {

		Integer num = new Integer(100);
		doSomething(num);

		doSomething(100);
		Integer myNum = Integer.valueOf(18);
		doSomething(myNum);
		doSomething(Integer.valueOf(100));
		doSomething(Integer.parseInt("100"));// 100

		int val = Integer.parseInt("100"); // from String to primitive type of int
		doSomething(val);

		// can we set a Integer variable to null
		// int x = null; ==> BAD IDEA!!!
		Integer b = null;
		doSomething(b);
		// doSomething(null);==> wrong!!!

		Integer x = 100;
		doSomething(x);
		doSomething(5);

		// auto unboxing
		int i = new Integer(3);
		System.out.println(i);

		doSomething(10);
	}

	public static void doSomething(int x) {
		System.out.println("Do something(int x)");

	}

	public static void doSomething(Integer x) {
		System.out.println("Do something(Integer x)");

	}

	public static void doSomething(int... myVarArg) {
		System.out.println("Do something(int... x)");
	}
}
