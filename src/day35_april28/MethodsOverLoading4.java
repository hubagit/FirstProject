package day35_april28;

public class MethodsOverLoading4 {

	public static void main(String[] args) {
		// any literal non-fractional numbers will be seen as int
		// any literal fractional numbers will be seen as double

		int i = 10;
		add(i);

		add(10L);
		add((int) 10L);
		//this just my practice!!!
		add((int)10.8f);

	}

	// this method can take any argument of type int
	// or anything that can be stored inside int variable
	// for example short, bytes, and long are allowed
	// but not float or double

	public static void add(int x) {

		System.out.println("int x " + x);
	}

	public static void add(long x) {
		System.out.println("long x " + x);
	}
}
