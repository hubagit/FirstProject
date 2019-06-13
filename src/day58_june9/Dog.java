package day58_june9;

public class Dog extends Animal implements IndoorPet {

	public String breed;
	public String legsCount="Dog leg";
	@Override
	public void makeNoise() {
		System.out.println("woof woof");
	}
	
	@Override
	public String toString() {
		return "Dog version of toString";
	}
	public static void doStatic() {
		System.out.println("dog static");
	}
}
