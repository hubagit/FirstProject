package day20_march31;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		String pass = "";
		
		while (!(name.equals("abc") && pass.equals("123"))) {
			System.out.println("Enter username: ");
			name = scan.next();
			System.out.println("Enter password: ");
			pass = scan.next();
			
			
		}
		
//		do {
//			System.out.println("Enter username: ");
//			name = scan.next();
//			System.out.println("Enter password: ");
//			pass = scan.next();
//		} while (!(name.equals("abc") && pass.equals("123")));

		System.out.println("END!");
	}

}
