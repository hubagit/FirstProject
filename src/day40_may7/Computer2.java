package day40_may7;

public class Computer2 {

	// provide instance variables/fields for the computer class:
	// type, ram,screenSize,color,OS,isPersonal
	// it's highly not recommended to have main method inside this class

	// unknown, it's a default value of type instance variable (property)
	// later we can change default values. if they are not final

	String type = "unknown";
	int ram;
	double screenSize;
	String color;
	String OS;
	boolean isPersonal;

	public void printInfo() {
		System.out.println("Type: " + type + ", OS: " + OS + "," + " Color: " + color + ", Ram: " + ram
				+ "GB, Personal? " + isPersonal);
	}
}
