package day5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
         Scanner input = new Scanner(System.in);
             
         System.out.println("What is your name?");
            
         String name = input.next();
         System.out.println("Your name is " + name);
         System.out.println("What is last name?");
         
         String lastName = input.next();
         System.out.println("Your last name is " + lastName);
         System.out.println("What is your nationality?");
         
         String nationality = input.next();
         System.out.println("Your nationality is " + nationality);
         System.out.println("Where do you live?");
         
         String cityState = input.next();
         System.out.println("Your city and state is " + cityState);
         System.out.println("How old are you");
         
         int age = input.nextInt();
         System.out.println("Your age is " + age);
         
         
         
	}

}
