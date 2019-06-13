package day58_june9;

public class Horse extends Animal {

	public String color;
	public String legsCount="Horse leg";
	@Override
	public void makeNoise() {
		System.out.println("neigh neigh");
	}
	public static void doStatic() {
		System.out.println("horse static");
	}
}
