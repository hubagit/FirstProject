package day55_june2;

public abstract class AbstarctClassWithNoAbstarctMethod {

	/*
	 * Abstract method must be in abstract class
	 * 
	 * however An abstract class does not have to have abstract method
	 * 
	 * The only effect of making this abstract at this moment is to prevent object
	 * 
	 * being created out of this class
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// this does not compile
		// AbstarctClassWithNoAbstarctMethod obj = new
		// AbstarctClassWithNoAbstarctMethod();
	}
}
