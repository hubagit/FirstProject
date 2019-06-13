package day35_april28;

public class Task1 {

	public static void main(String[] args) {
		/// Create few static methods called addNums

		// first one takes 2 numbers and add them
		// return the result as int

		// second one takes 3 numbers and add them
		// return the result as int

		// third one takes 4 numbers and add them
		// does not return a value ,
		// just print out the result
		
		System.out.println(addNums(3, 5));
		System.out.println(addNums(3, 5, 7));
		addNums(3, 5, 7, 9);
	}

	// not valid because of same method name and same method parameter list
//  public static void addNums(int x,int y) {
//    System.out.println("aaaaa");
//  }

// not valid because of same method name and same method parameter list
//  public static int addNums(int a,int b) {
//    return a+b;
//  }

	public static int addNums(int a, int b) {

		return a + b;
	}

	public static int addNums(int x, int y, int z) {
		int result = x + y + z;
		return result;
	}

	public static void addNums(int i, int j, int k, int m) {

		System.out.println(i + j + k + m);
	}

}
