package day5;

import java.util.Scanner;

public class ExampleForMyself{
		
		public static void main(String[] args) {
		
		         Scanner keyboardInput = new Scanner(System.in);
		         
		         System.out.println("tell me your name?");
		         
		         String name = keyboardInput.next();
		         
		         System.out.println("Your name is " + name);
		         
		         System.out.println("tell me last name?");
		         
		         String last = keyboardInput.next();
		         
		         System.out.println("Your last name is " + last);
		         
		         System.out.println("Your full name is " + name + " " + last);
		}     
	

}
