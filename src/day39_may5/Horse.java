package day39_may5;

public class Horse {

	// Task
	// create a custom class called
	// horse
	// any object created out of this class
	// should have 4 attributes as below
	/*
	 * 
	 * 
	 * breed as a String age as an int color as a String height as a double
	 * 
	 */

	// instance variable/field
	// to define properties/attributes of objects being created
	// out of this class

	String breed;
	int age;
	String color;
	double height;

	String nameOfHorse;
	int ageOfHorse;
	String colorOfHorse;
	double heightOfHorse;

	public static void main(String[] args) {
		// each object attributes
		// are completely independent from
		// any other objects that created
		// from same class
		Horse h1 = new Horse();
		h1.breed = "Ottoman";
		h1.age = 5;
		h1.color = "brown";
		h1.height = 3.4;

		Horse h2 = new Horse();
		// setting attributes of an object
		h2.breed = "Turkish";
		h2.age = 6;
		h2.color = "white";
		h2.height = 3.7;

		// reassigned to new value
		h1.color = "black";

		System.out.println(h1.color);
		System.out.println(h2.height);

		// System.out.println(h1); //this gives hashCode ==> it should be .toString(); <== ??

		System.out.println(h1.breed);
		System.out.println(h1.color);
		System.out.println(h2.color);
		
		Horse h3 = new Horse();
		h3.nameOfHorse = "At";
		h3.ageOfHorse = 15;
		h3.colorOfHorse = "Blue";
		h3.height = 2.9;
		
		System.out.println("================Practice=============");
		System.out.println(h3.nameOfHorse);
		System.out.println(h3.ageOfHorse);
		System.out.println(h3.colorOfHorse);
		System.out.println(h3.height);
		
		h3.nameOfHorse = "BR";
		System.out.println(h3.nameOfHorse);
		
		
		
		
		
		
		

	}
}
