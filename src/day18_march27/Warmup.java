package day18_march27;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {

		long x = 10;
		long y = 10;

		System.out.println(x == y);
		// scan1 is a variable/ container that can hold
		// the address of any single scanner object
		// the reference to any single scanner object
		// the pointer to any single scanner object
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = scan2;
		System.out.println(scan1 == scan2);
		System.out.println(scan2 == scan3);

		String s1 = "literal";
		String s2 = new String("Literal");
		String s3 = "literal";
		String s4 = "cat";

		// since "literal" already exists in the pool
		// it will not create new object and it will just
		// point to existing object

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

	}

}
