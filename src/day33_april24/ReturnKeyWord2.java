package day33_april24;

public class ReturnKeyWord2 {
	/// BREAK VS RETURN
	/*
	 * break : ---> we can only use it inside switch and loop
	 * 
	 * return : --> exclusively used to return a value or terminate method execution
	 */
	public static void main(String[] args) {
		ageTester(16);
		System.out.println("===========1==========");
		ageTester(36);
		System.out.println("===========2==========");
		System.out.println(isAdultOrNot(16));
		System.out.println("===========3==========");
		System.out.println(isAdultOrNot(26));
	}
	// a method that returns a value of any type
	// should not have any chance to not return value
	// or it will not even compile

	// you may have many return statement in different execution path
	// buy you may only return one value

	/**/
	public static boolean isAdultOrNot(int age) {

		if (age < 18) {
			System.out.println("not an adult");
			return false;
		}

		return true;

	}

	public static void ageTester(int age) {
		if (age < 18) {
			System.out.println("not an adult");
			return;
			// once the return keyword is reached
			// it will exit the method
		}
		System.out.println("go to work");
		System.out.println("get paid");
		System.out.println("pay your bill");

	}
}
