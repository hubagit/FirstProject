package day59_june11;

import day58_june9.*;

public class AnimalShow59_2 {

	public static void main(String[] args) {

		// cat is a cat
		Cat c1 = new Cat();
		// copying the address stored inside c1
		// into c2 variable, and its pointing to same object
		Cat c2 = c1;

		// c1 = new Dog(); //==>> can not do this
		Animal a1 = c1;
		a1 = new Dog();
		IndoorPet i1 = c1;
	
	
	
	}
}
