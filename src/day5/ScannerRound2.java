package day5;

import java.util.Scanner;

public class ScannerRound2 {

	public static void main(String[] args) {
		
		// creating scanner object
		Scanner input = new Scanner(System.in);
		
		//asking user questions
		System.out.println("Enter your first name : ");
		
		// force user to enter input/data
		String firstName = input.next();
		
		//an format the display output
		System.out.println("Your first name is " + firstName);
		
		System.out.println("Enter your last name : ");
		// force user to enter input/data
		String lastName = input.next();
		
		//an format the display output
		System.out.println("Your last name is " + lastName);
		
		System.out.println("Your full name is " + firstName + " " + lastName);
		
		
		
		

	}

}
