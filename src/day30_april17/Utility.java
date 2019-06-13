package day30_april17;

import java.util.Scanner;

import day29_april16.Spartan;

public class Utility {

	public static void main(String[] args) {
		// calling the method
		
//		printUsersName();
//		Utility.printUsersName();

		//we can call methods coming from different classes
		//if the class is under same package no import needed
		//else import is mandatory
		
		Spartan.releaseTheHorse();
		
		myMethod();

	}

	public static void printUsersName() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name :");
		String name = scan.next();
		System.out.println("You entered " + name);

	}

	public static void myMethod() {
		System.out.println("This is my new method");
	}
}
