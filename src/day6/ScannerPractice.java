package day6;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your mood?: ");
		
		String mood = input.nextLine();
		System.out.println("Your mood today is:" + mood);
		
		System.out.println("Enter your location: ");
		
		String location = input.nextLine();
		System.out.println("Your location is " + location);
		
		
		
		
		

	}

}
