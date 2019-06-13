package day34_april27;

public class VarArgs {

	public static void main(String[] args) {

		// Vararg --> variable number of arguments

		// we are passing 2 external data to a method
		// that has 2 parameter

		// we are passing 2 argument data to a method
		// that has 2 parameter

		// argument
		add2Numbers(10, 12);
		add3Numbers(10, 12, 20);

		System.out.println("================1==============");

		addManyNumbers(new int[] { 1, 4, 66, 33 });
		//addManyNumbers(1,2,3,4,5,6); --> worng!!!
		
		System.out.println("================2==============");

		addManyNumbers2(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9);
		addManyNumbers2(1, 2, 3, 4);
		addManyNumbers2(1, 2, 3, 4, 5, 6, 7);
		addManyNumbers2(1, 2);

		// you may pass an array into method that takes var args
		// practically we don't, but possible
		// addManyNumbers2(new int[] { 1, 2, 3 });

		// varArg --> is used to create a method
		// that can take variable numbers of arguments of same type
		// when being called

		// varArg parameter is represented by using ... after method
		// parameter data type
		// and it can only be used here
	}

	// method parameters
	public static void add2Numbers(int num1, int num2) {

		System.out.println(num1 + num2);

	}

	public static void add3Numbers(int num1, int num2, int num3) {

		System.out.println(num1 + num2 + num3);

	}

	public static void addManyNumbers(int[] manyNums) {

		int sum = 0;

		for (int eachNum : manyNums) {
			sum += eachNum;
		}

		System.out.println(sum);

	}

	public static void addManyNumbers2(int... manyNums) {

		// int[] manyNums = {1, 2, 3, 4, 5, 6, 7}
		// varArgs are seen exactly the same as an array
		// inside method body

		int sum = 0;

		for (int eachNum : manyNums) {
			sum += eachNum;
		}
		System.out.println(sum);

	}
}
