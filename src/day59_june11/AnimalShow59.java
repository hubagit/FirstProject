package day59_june11;

import day58_june9.*;

public class AnimalShow59 {

	public static void main(String[] args) {
		
		//cat is a cat
		Cat c1 = new Cat();
		//cat is an animal
		Animal a1 = new Animal();
		//cat is an indoorPet
		IndoorPet i1 = new Cat();
		//Animnal is a cat ==>> NOT VALID
		//Cat a2 = new Animal();
		//cat IS-A object
		Object o1 = new Cat();
	}
}
