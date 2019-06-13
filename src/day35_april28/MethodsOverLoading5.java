package day35_april28;

public class MethodsOverLoading5 {

	public static void main(String[] args) {
		// any literal non-fractional numbers will be seen as int
		// any literal fractional numbers will be seen as double

//		double d;
//		d = 10;
//		System.out.println(d);
//		d = 10L;
//		System.out.println(d);
//		d = 10f;
//		System.out.println(d);

		release((short) 10);
		release((byte) 10);
		release(10);
		release(10L);
		release(10f);
		release(10d);
		release(10.5);
		release(15 / 2); // 7
		release(15 / 2.0); // 7.5 double
		release(15 / 2.0f); // 7.5 float
		
		
	}

	public static void release(double d) {
		System.out.println("double " + d);

	}

	public static void release(int d) {
		System.out.println("int " + d);

	}

	public static void release(float f) {
		System.out.println("float " + f);

	}
}
