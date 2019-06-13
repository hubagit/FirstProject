package day39_may5;

public class Garage {

	public static void main(String[] args) {
		
		//default values for field
		//if it's not defined
		
		/*
		 * any reference type field ==> null
		 * any whole numbers type ==> 0
		 * any fractional numbers type ==> 0.0
		 * char ==> empty char or ascii 0
		 * boolean ==> false
		 */
		
//		int i; // this doesn't compile
		// local variable needs to be initialized before usage
//		System.out.println(i);
		
		Car c1 = new Car();
		c1.model = "Toros";
		c1.make = "Toyota";
		c1.year = 2019;
		c1.price = 60000;
		c1.horsepower= 200;
		
		System.out.println(c1.model);
		System.out.println(c1.make);
		System.out.println(c1.year);
		System.out.println(c1.price );
		System.out.println(c1.horsepower);
		System.out.println(c1.isConvertable);
		
		

	}

}
