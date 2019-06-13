package day21_april2;

import java.util.Scanner;

public class StringAndLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// EVERY FOR LOOP CAN BE WRITTEN IN WHILE LOOP
		// use for loop to print your name char by char
		// and print reverse order char by char
		// save it into another variable

		String name = scan.next();
		int count = name.length();
		

//		for (int i = 0; i < count; i++) {
//			System.out.print(name.charAt(i)+" ");
//			
//		}

//		for (int i = count - 1; i >= 0; i--) {
//			System.out.print(name.charAt(i)+" ");
//		}
		String newName = "";
		for (int i = count - 1; i >= 0; i--) {
			newName +=name.charAt(i)+" ";
		}
	System.out.println(newName);
	}

}
