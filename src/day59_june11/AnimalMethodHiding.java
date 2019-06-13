package day59_june11;

import day58_june9.*;

public class AnimalMethodHiding {

	public static void main(String[] args) {
		
		//Animal.doStatic();
		//Dog.doStatic();
		//Horse.doStatic();
		
		Animal myAni = new Dog();			
		myAni.doStatic();
		
		Animal myAni1 = new Horse();			
		myAni1.doStatic();
		
		Animal myAni2 = new Cat();			
		myAni2.doStatic();

	}

}
