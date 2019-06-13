package day58_june9;

public class Cat extends Animal implements IndoorPet {

	@Override
	public void makeNoise() {
		System.out.println("meow meow");
	}
}
