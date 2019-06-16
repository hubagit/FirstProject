package day61_june15;

import day58_june9.*;

public class InstanceOf {

	public static void main(String[] args) {

		Animal a1 = getMyAnimal();

		String objTypeName = a1.getClass().getSimpleName();
		System.out.println(objTypeName);

		// instanceOf operator is for checking your object reference type
		// IS_A the type you specified

		// Cat c1 = (Cat)a1;
		boolean isDog = (a1 instanceof Dog);
		System.out.println("is a1 pointing to a type of Dog: " + isDog);

		boolean isCat = (a1 instanceof Cat);
		System.out.println("is a1 pointing to a type of Cat: " + isCat);

		if (isCat == true) {
			Cat c1 = (Cat) a1;
			System.out.println(c1.legsCount);
		} else if (isDog == true) {
			Dog d1 = (Dog) a1;
			System.out.println(d1.legsCount);
		}

		// if object type of reference variable a1 is pointing to IS-A the type you're checking
		// using instance of keyword
		boolean isAnimal = a1 instanceof Animal; // ObjType Dog IS_A animal or not
		System.out.println("is a1 pointing to a type of Cat: " + isAnimal);

		boolean isObject = a1 instanceof Object; // ObjType Dog IS_A Object or not
		System.out.println("is a1 pointing to a type of Cat: " + isObject);

		// CAN NOT USE INSTANCE OF KEYWORD FOR UNRELATED TYPES!!!
		// boolean isShape = a1 instanceof Shape; //ObjType Dog IS_A Shape or not

	}
	/*
	 * create a static method that returns Animal and return valid animal sub class
	 * object
	 */
	public static Animal getMyAnimal() {

		Animal a1 = new Dog();
		// Animal a2 = new Cat();
		return a1;
	}

}
