package day20_march31;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		String name = scan.next();

		//char c =name.charAt(0);     -->> will not work
//		String fUp = name.substring(0,1).toUpperCase();
//		String expected = fUp+name.substring(1);
		
//		System.out.println(expected);
		
//		System.out.println(fUp+""+name.substring(1));
		
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		int x = 0;
		do {
			System.out.print( name.charAt(x)+" ");
			x++;
		} while (x<name.length());
		
		
		
		
		
	}

}
