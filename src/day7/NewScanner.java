package day7;
import java.util.Scanner;
 
//import java.util.*
//import java.lang.String;

public class NewScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = scan.next();
		scan.nextLine();

		System.out.println("Enter your company: ");
		String company = scan.nextLine();

		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		
//		byte b = scan.nextByte();
//		short s = scan.nextShort();
//		long l = scan.nextLong();
//		float f = scan.nextFloat();
//		double d = scan.nextDouble();
//	    //char c = scan.nextChar() NO Char !!!
//		boolean isHungary = scan.nextBoolean();
	
		System.out.println("Hello fellow coder, your name is " + name + "." + '\n'
		        + "You work at " + company + "." + '\n'
				+ "You are " + age + " years old.");
	}

}
