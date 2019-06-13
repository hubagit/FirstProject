package day11_march16;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		if (i%5==0 && i%3==0) {
			System.out.println("fizz buzz");
		}else if (i%3==0) {
			System.out.println("buzz");
		} else if(i%5==0)  {
			System.out.println("fizz ");
		} else {
			System.out.println("Not a good number");
		}

	}

}
