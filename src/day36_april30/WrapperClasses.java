package day36_april30;

public class WrapperClasses {

	public static void main(String[] args) {

		int i = 10;

		// boolean, char, byte, short, int, long, float, double

		/*
		 * Wrapper class ==> specifically designed to store primitive value as object
		 */

		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("false");
		Boolean b2 = Boolean.valueOf(true);
		Boolean b3 = Boolean.valueOf("true");

		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		Integer i1 = new Integer(123);
		Integer i2 = new Integer("123");
		Integer i3 = Integer.valueOf(123);
		Integer i4 = Integer.valueOf("123");

		System.out.println("equal? " + i1.equals(123));
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);

		int j = 10;

		Character c1 = new Character('c');
		Character c2 = Character.valueOf('c');
		System.out.println(c1);
		System.out.println(c2.toString());
		
		Long l1 = new Long(123L);
		Long l2 = Long.valueOf(123L);
		
		Float f1 = new Float(12.3f);
		Float f2 = Float.valueOf(13.4f);

		
	
	
	
	
	
	
	
	
	
	}

}
