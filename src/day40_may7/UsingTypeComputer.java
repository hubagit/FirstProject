package day40_may7;

import java.util.ArrayList;

public class UsingTypeComputer {

	public static void main(String[] args) {

		// What can we do when we have a class

		/*
		 * Create object out of it
		 * 
		 * It will become a type Create a reference variable Computer iMac, Use it as
		 * method parameter, Use it as method return type, Use it as type for ArrayList
		 * object
		 * 
		 */

		Computer myComputer = new Computer();
		Computer practice = new Computer();

		ArrayList<String> lst = new ArrayList<>();

		ArrayList<Computer> comlst = new ArrayList<>();
		comlst.add(myComputer);
		comlst.add(new Computer());

		ArrayList<Computer> practiceList = new ArrayList<>();
		practiceList.add(practice);
		practiceList.add(new Computer());

		String str = new String("actual String");
		String[] strArr = new String[3];
		String practiceStr = new String();
		String[] parcaticeStrArr = new String[2];

		Computer myComp = new Computer();
		Computer[] comArr = new Computer[3];

		Computer practiceComp = new Computer();
		Computer[] practiceCompArr = new Computer[2];

		printComputer(myComp);
		printPracticeComputer(practiceComp);
		Computer c = getComputer();
		System.out.println(c.OS);
		System.out.println(getPracticeComputer().ram);

	}

	// We Created a method that returns computer object
	public static Computer getComputer() {
		// in order to return computer object
		// first we need to create an object
		Computer iMac = new Computer();
		iMac.OS = "MAC OS";
		return iMac; // returned computer object

	}

	public static Computer getPracticeComputer() {
		Computer practiceComputer2 = new Computer();
		practiceComputer2.ram = 12;
		return practiceComputer2;
	}

	// created a method that accepts computer as parameter
	// so when we call this method
	// we will pass computer object as argument
	public static void printComputer(Computer comObject) {

		System.out.println("computer object");

	}

	public static void printPracticeComputer(Computer comPracObject) {
		System.out.println("Practice computer object");
	}

	public static void printString(String strObj) {
		System.out.println(strObj);
	}

	public static String getString() {
		return "my string";
	}

}
