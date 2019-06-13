package day29_april16;

public class Spartan {

	public static void main(String[] args) {

		Spartan.releaseTheHorse();
		Spartan.releaseTheHorse();
		// if you are in same class where the method is defined
		// className. is optional
		releaseTheHorse();

		holdYourHorse();

		newMethowWithoutparameters();

	}

	public static void releaseTheHorse() {
		System.out.println("Release it now Please !!!");
		System.out.println("Go!!!");
		// method is created inside class
		// it should not be inside any method (like main method)

		// method is an action
		// such as;
		// release the horse

		// we will start with
		/*
		 * method that does not take external data method that does not return any value
		 * method that does not need an object to be called
		 * 
		 * Arrays.toString(arr)
		 * 
		 * Spartan.releaseTheHorse() ;
		 * 
		 * 
		 * public --- access modifier -- to define where it can be used 
		 * static --- non-access modifier if defined , it means no object needed to call this 
		 * void  ---- it means this method only take action and does not return any value
		 */

	}

	public static void holdYourHorse() {
		String owner = "Mustafa";
		System.out.println(owner + ", hold your horse please!");
	}

	public static void newMethowWithoutparameters() {

		int numbers = 1232;
		System.out.println(numbers + " is a good number!");

	}

}
