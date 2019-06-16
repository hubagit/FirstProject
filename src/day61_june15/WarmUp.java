package day61_june15;

import day56_june5.*;
import day56_june5.Shape;
import day58_june9.*;

public class WarmUp {

	public static void main(String[] args) {

		int i = 10;
		long l = i;

		double d = 3.14;
		int a = (int) d;

		System.out.println(a);

		Dog d1 = new Dog();
		// upcasting
		// Animal a1 = d1;
		// Dog d2 = (Dog) a1;

		// Cat c = (Cat) d1; // can not compile

//		Object o = new Object();
//		Dog d3 = (Dog) o; /// Dog d3 = new Object();

		Object o1 = new Dog();
		Dog d4 = (Dog) o1;

		// Shape s = new Square("red", 6);
		// Square sq = (Square) s; // ==> does not cast
		// something is missing here ==> look at GitUp???

		day58_june9.Shape s = new Square("asdsa", 6);
		Square sq = (Square) s;

	}
	// polyMorphism
	/*
	 * Ability of object to take multiple forms
	 * 
	 * Ability of object to be referred by its super type and take object specific
	 * action at run time
	 * 
	 * Animal a = Dog();
	 * 
	 * a.makeNoise();
	 * 
	 * a = new Cat();
	 * 
	 * a.makeNoise();
	 * 
	 * Animals makeNoise ==> Dog ==> woof, Cat ==> meow
	 * 
	 * List<String> lst = new ArrayList<>();
	 * 
	 * it provides flexibility
	 * 
	 * we can group objects together by its general type
	 * 
	 * Animal[] animals = {new Dog(), new Cat(), new Horse()};
	 * 
	 * METHOD PARAMETERS:
	 * 
	 * for example:
	 * 
	 * public static void animalNoiseTester(Animal anyAnimal){
	 * 
	 * 
	 * } // what argument we can pass to above method
	 * 
	 * animalNoiseTester(new Dog() );
	 * 
	 * animalNoiseTester(new Cat() );
	 * 
	 * RETURN TYPE:
	 * 
	 * public static Animal getMyAnimal(){
	 * 
	 * return new Dog() or new Cat() or new Horse();
	 * 
	 * }
	 * 
	 * // each class in Java implicitly extends Object if not already extending
	 * another class.
	 * 
	 * interface does not have this concept.
	 * 
	 * 
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * // what decides what member can be accessible using the reference variable
	 * ==> ONLY REFERENCE TYPE
	 * 
	 * Animal a = new Dog();
	 * 
	 * a can access only the members that are visible to the Animal
	 * 
	 * a.makeNoise() ==>> woof
	 * 
	 * //what if we really want to access anything that only exists in Sub class
	 * 
	 * Dog d = (Dog) a;
	 * 
	 * d.dogStuff;
	 * 
	 * 
	 */

}
