package day56_june5;

public abstract class Animal {

	public abstract void makeNoise();

}

// what if sub class is also an abstract class
// you are not required to implement abstract methods inherited from super class
abstract class Mammals extends Animal {

	// abstract sub class has option not to provide implementation
	// but you can optionally provide implementation so sub class of this class
	// can use it
	// or override what's inherited
	@Override
	public void makeNoise() {
		System.out.println("mammals are making noise");
	}

	// abstract methods can be overloaded
	public abstract void eat(String foodName);

	public abstract void eat(String foodName, int amount);

}

class Horse extends Mammals {

//	@Override
//	public void makeNoise() {
//		System.out.println("neigh neigh neigh");
//	}

	@Override
	public void eat(String foodName) {
		System.out.println("Eating food " + foodName);

	}

	// public abstract void eat(String foodName, int amount);
	public void eat(String foodName, int amount) {
		System.out.println("another eat method");

	}
}