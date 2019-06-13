package day53_may29;

public class Dog extends Animal {

	// not overridden method
	// different method
	// because we don't override static methods
	public static void m1() {
		System.out.println("Dog class m1");
	}
	// there is no connection between static methods.
	// in the sub class an super class

	// super() - for constructor
	// super. - for instance methods, fields.

	@Override // non-static
	public void run() { // overridden method
		// parent version of m1() method
		super.run(); // we are calling super m1()
		System.out.println("Dog is runing");
	}
}
