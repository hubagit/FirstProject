package day15_march23;

import java.util.Scanner;

public class AmazonSearchTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter item to search for: ");
		String itemToSearchFor = sc.nextLine();

		System.out.println("You have entered : " + itemToSearchFor);

		// Amazon.com : itemToSearchFor

		String expectedresult = "Amazon.com :iPad";
		String actualResult = "Amazon.com :" + itemToSearchFor;

		if (expectedresult.equalsIgnoreCase(actualResult)) {
			System.out.println("Test pass for iPad");
		} else {
			System.out.println("Test fail for iPad");
		}
	
	
	
	}

}
