package day51_may26;

public class Horse extends Animal {

	// every time horse make noise
	// it should make animal noise first
	// then it should make horse specific noise
	@Override
	public void makeNoise() {
		// System.out.println("general noise");
		super.makeNoise(); // to tell compiler that I'm calling super class version of method

		// this will call current method itself rather than super class version
		// makeNoise();

		// below 3 statement are all legal!!!
		// super.eat();
		// eat();
		// this.eat();
		System.out.println("Horse -- NAi Nai Nai");
		// super.makeNoise();
		// System.out.println("done neighing");
		// super.makeNoise();
		// System.out.println("now really done neighing");
	}
	/*
	 * public void eat() { System.out.println("eating!!!"); }
	 */
}
