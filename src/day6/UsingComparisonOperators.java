package day6;

import java.util.Scanner;

public class UsingComparisonOperators {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter num2: ");
		int num2 = input.nextInt();
		 
		boolean isGreater = num1 > num2;
		System.out.println("Is number1 greater than number 2: " + isGreater);
		input.close();
	}

}
