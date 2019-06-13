package day59_june11;

import day58_june9.*;

//fields are not overridden it's only hidden
//and only reference type decide3 what you can access
//that's why there is no power of polymorphism is going on here
//the field is being accessed is all coming from animal class at compile time and run time
public class AnimalFieldHiding {

	public static void main(String[] args) {
		
		Animal myAni = new Dog();		
		System.out.println(myAni.legsCount);
		myAni.makeNoise();
		Animal myAni1 = new Horse();		
		System.out.println(myAni1.legsCount);
		myAni1.makeNoise();
		Animal myAni2 = new Cat();		
		System.out.println(myAni2.legsCount);
		myAni2.makeNoise();
	}

}
