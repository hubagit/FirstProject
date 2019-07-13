package day63_june29;

import java.io.FileNotFoundException;

// WE CAN DECLARE MULTIPLE EXCEPTION TYPE IN METHOD SIGNATURE BY SEPARATING BY COMA 

public class MethodThatMightThrowCheckedException2 {

	public static void main(String[] args) {

		System.out.println("Beginning");

		// handle or declare
		try {
			doSomethingDangerous();
//    } catch (InterruptedException|FileNotFoundException e ) {
//      System.out.println("same exact action");
		} catch (Exception e) {
			System.out.println("caught");
		}

		System.out.println("Ending");

	}

	public static void doSomethingDangerous() throws InterruptedException, FileNotFoundException {

		System.out.println("some dangerous action with multiple consequences");
		throw new InterruptedException();
	}

}
