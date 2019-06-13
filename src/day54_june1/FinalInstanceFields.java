package day54_june1;

public class FinalInstanceFields {

	// final fields must be initialized
	// before the object creation completed

	final int NUM = 100;				
	final int NUM1 = getNumber();
	final int NUM2;
	final int NUM3;

	{
		NUM2 = 200;
	}

	public FinalInstanceFields() {
		NUM3 = 300;
	}

	private int getNumber() {

		return 150;
	}

	public static void main(String[] args) {

		// local final variable does not have to get initial vale
		// if not used.

		// local final variable cannot not be reassigned
		// once it gets initial value
		final int x;
		x = 20;
		// x = 30;
		System.out.println(x);

		FinalInstanceFields f1 = new FinalInstanceFields();
		System.out.println(f1.NUM);
		System.out.println(f1.NUM2);
		System.out.println(f1.NUM3);

		// f1.NUM=200; can not reassign value for final variable
		System.out.println("the end");

	}

}
