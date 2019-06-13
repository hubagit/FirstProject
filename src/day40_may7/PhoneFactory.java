package day40_may7;

public class PhoneFactory {

	public static void main(String[] args) {

		Phone iPhone = new Phone();

		// how we are accessing instance fields
		// or instance variables
		// object-it's an instance of class
		// in this case, iPhone it's an object of Phone class
		// we are defining values of instance variables
		// only for this particular object
		iPhone.brand = "Apple";
		iPhone.OS = "IOS";
		iPhone.model = "Iphone XS";
		iPhone.color = "Rose Gold";
		iPhone.storageSize = 256;
		iPhone.isWaterResistant = true;
		iPhone.screenSize = 5.8;
		iPhone.ram = 3;
		iPhone.camera = 12;
		iPhone.price = 999.99;
		iPhone.support5G = false;
		iPhone.imei = 99000862471854L;

		// now let's check what this iPhone has

		System.out.println("Brand: " + iPhone.brand);
		// it will display this message: Phone is ringing
		iPhone.ring();
		iPhone.call();
		iPhone.sendSMS("Hello World!", 5718930234L);
		iPhone.dial(5718930234L);
		iPhone.printInfo();
		System.out.println("=======================");

		// Task
		// create 2 more objects of Phone class:
		// assign values to the attributes

		// here we have created one more object of Phone class
		// samsung- it's a name of new object

		Phone samsung = new Phone();
		samsung.brand = "Samsung";
		samsung.model = "Galaxy s10 5G";
		samsung.color = "Black";
		samsung.OS = "Android";
		samsung.price = 599.99;
		samsung.sendSMS("How are you!", 3124125096L);
		samsung.dial(3124125096L);
		samsung.dial(3124125096L);		
		
		System.out.println("=======================");
		
		Phone google = new Phone();
		google.color = "White";
		google.camera = 8;
		google.brand = "Google";
		google.model = "Pixel 3";
		google.price = 235d;
		google.storageSize = 256;
		google.isWaterResistant = true;
		google.screenSize = 5.8;
		google.ram = 3;
		google.ring();
		google.call();
		
		System.out.println("=======================");
		System.out.println(iPhone.brand);
		System.out.println(google==iPhone); //false!!!

	}
	// add your own method to the Phone class
	// i CANNOT DO LIKE THIS: pHONE.RING();
	// IT'S not a valid because it's not static method
	// I have to crate an object, before accessing these method
	// and instance fields
	// static methods, variables ==> belong to class

}
