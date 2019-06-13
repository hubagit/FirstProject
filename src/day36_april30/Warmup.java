package day36_april30;

public class Warmup {

	public static void main(String[] args) {
		// Method Overloading

		/*
		 * Same method name + different parameter list
		 * 
		 * Does return type matter? No, it is not part of method signature method
		 * name+parameter list
		 * 
		 * 
		 * 
		 */

		
		myMethod(2,2);
		System.out.println();
	}

	public static void myMethod() {

	}

	public static void myMethod(String str) {

	}

	public static void myMethod(double i, double d) {

	}

	public static void myMethod(double d, int i) {
		
		System.out.println(d+i);
	}
}
