package day9_march12;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Math Library!");
		System.out.println("Enter 2 integers: ");
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		int total = num1+num2;
		if(total >100) {
			System.out.println("You entered great numbers!");
			
		}else {
			System.out.println("looks like your sum is less than or equal 100.");
		}

	}

}
