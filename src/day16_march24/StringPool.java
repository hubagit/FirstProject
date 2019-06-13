package day16_march24;

import java.util.Scanner;

public class StringPool {

	public static void main(String[] args) {
		
		String s1 = "abc"; //using string literal
		Scanner s = new Scanner(System.in);
		String s2 = s.next(); //this is a new object, too
		                     //new String("abc"); //new keyword
		
		System.out.println(s1==s2);
		
		String s3 = "abc";
		
		System.out.println(s1==s3);
		
		String s4 = new String ("abc");
		System.out.println(s4==s2);
		
		// SCP = String Constant Pool -->> String Pool
		
		//what is a String pool:
		//string pool is a special location inside heap
		//to store unique string literal

	}

}
