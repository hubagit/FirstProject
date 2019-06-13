package day5;

import java.util.Scanner;

public class NewClass {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter your name please:");
		
		//String name = userInput.next(); //read only one word
		String name = userInput.nextLine(); //read one whole line
		
		System.out.println("You've entered : " + name);		
		
		
		
		
				

	}

}
