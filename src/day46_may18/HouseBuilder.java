package day46_may18;

public class HouseBuilder {

	public static void main(String[] args) {

		CyberHouse h1 = new CyberHouse(1, "Victorian");
		CyberHouse h2 = new CyberHouse(2, "Victorian");

		// accessing static variable
		// we access static members using static way
		// classname.staticfieldName
		// classname.staticMethodName(args...)

		// CyberHouse.neighborhoodName = "Cybertek Corner";
		System.out.println(CyberHouse.neighborhoodName);

		System.out.println(h1.houseNumber);
		System.out.println(h2.houseNumber);
		h1.houseNumber = 100;

		// changing instance variable value of an object
		// does not affect another object
		System.out.println(h2.houseNumber);

		// can we use object to access static variable
		// even though it's recommended to use static way
		// which is className.staticVariable we can use it

		System.out.println(h1.neighborhoodName);
		System.out.println(h2.neighborhoodName);
		// changing static variable value of using static way
		// or using object will affect each every object
		h1.neighborhoodName = "Cybertek Tower";
		System.out.println(h2.neighborhoodName);

	}

}
