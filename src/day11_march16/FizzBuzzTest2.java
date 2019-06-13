package day11_march16;

import java.util.Scanner;

public class FizzBuzzTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number to see if it is Fizz Buzz or not: ");
		int i = scan.nextInt();
		String result;
		
		result = (i%3 == 0 && i%5 == 0) ?  "fizzBuzz" : (i%3 == 0) ?  "Buzz":  (i%5 == 0)? "Fizz": "notFizzBuzz";
		
		
		System.out.println("Your result is: "+ result);
		
	}

}
