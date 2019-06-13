package day54_june1;

public class FinalParameters {

	public static void main(String[] args) {

		//printItems();
		printItems("abc efg");
		
	}

	// final method parameter will ensure the argument that passsed
	// to the methods does not change
	public static void printItems(final String item) {

		// item = "some other value";
		System.out.println("The item is " + item);
	}

//	public static void printItems() {
//		String item = "abc efg";
//		item = "some other value";
//		System.out.println("The item is " + item);
//	}
}
