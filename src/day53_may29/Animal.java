package day53_may29;

public class Animal {

	// from now one, this method hidden,
	// because sub class defines exactly same method
	public static void m1() {
		System.out.println("Animal class m1");
	}

	public static void m2() {
		System.out.println("Animal class m2");
	}

	public void run() {
		System.out.println("Animal is runing");
	}
}
