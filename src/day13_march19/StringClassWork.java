package day13_march19;

import java.util.Scanner;

public class StringClassWork {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 2 names:");
		String s1 = scan.next();
		String s2 = scan.next();

		s1.equalsIgnoreCase(s2);
		System.out.println(s1);

		if (s1.length() > s2.length()) {
			System.out.println("Second letter of "+ s1+ " is "+s1.charAt(1));
		} else {
			System.out.println("Third letter of "+ s2+ " is " + s2.charAt(2));
		}
	
		char lastChar = s1.charAt(s1.length()-1);
		
		switch (lastChar) {
		case 'a':
			System.out.println("name is ended with a");
			break;
		case 'b':
			System.out.println("name is ended with b ");
			break;
		case 'c':
			System.out.println("name is ended with c ");
			break;
			default :
				System.out.println("NO MATCH AT ALL!");
	
		}
		
		 // TASK 1
	    /*
	     * Ask user for two names check for the equality without caring about
	     * the case print result
	     * 
	     * also compare the length of the names if name1 has more character --->
	     * print second character of name1 else print 3rd character of name2
	     * 
	     * // OPTIONAL store the last character of name 2 in char variable and
	     * create switch statement to check few cases as below
	     * 
	     * case 'a' --> print name ended with a 
	     * case 'b' --> print name ended with b 
	     * case 'c' --> print name ended with c 
	     * if no match print did not get abc
	     */
	 

}

}
