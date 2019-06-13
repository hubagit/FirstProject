package day38_may4;

public class MethodOverLoadingSelectionOrder {

	public static void main(String[] args) {
		/*
		 * 
		 * METHOD OVERLOADING SELECTION ORDER
		 * 
		 * 1, IT WILL ALWAYS LOOK FOR EXACT MATCH
		 * 
		 * 2, IT WILL LOOK FOR LARGER PRIMITIVE TYPES
		 * 
		 * 3, IT WILL LOOK FOR WRAPPER TYPE
		 * 
		 * 4, VAR ARG
		 */

		doSomething(10);
		doSomething(18);

	}

	public static void doSomething(int x) {
		System.out.println("Do Something(int x)");
	}

	public static void doSomething(long x) {
		System.out.println("Do Something(long x)");
	}

	public static void doSomething(Integer x) {
		System.out.println("Do Something(Integer x)");
	}

	public static void doSomething(int... x) {
		System.out.println("Do Something(int... x)");
	}

}
