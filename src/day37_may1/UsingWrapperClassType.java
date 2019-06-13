package day37_may1;

public class UsingWrapperClassType {

	public static void main(String[] args) {

		String str = "Spartan";

		Integer i = 10;

		// when we call this method,
		// we need to pass an integer object as argument
		// since it returns an integer object
		// we can store them inside Integer ref variable

		Integer a = giveMeInteger(new Integer(300));

		// since it returns an integer object
		// we can store them inside Integer ref variable
		// if we store it int variable it will be auto unboxed into int value
		int a1 = giveMeInteger(new Integer(300));

		// when we call this method
		// we need to pass an integer object as argument
		Integer a2 = giveMeInteger(Integer.valueOf(200));
		// when we call this method
		// we need to pass an integer object as argument
		// if we pass primitive int
		// it will autoboxed into Integer object and pass as argument

		int a3 = giveMeInteger(300);

	}

	public static String reverse(String name) {
		return "some logic";
	}

	// This is a method that has one Integer as parameter
	// and returns an Integer object when being called
	public static Integer giveMeInteger(Integer num) {
		// return new Integer(10);
		// return Integer.valueOf("10");
		return 10;

	}

}
