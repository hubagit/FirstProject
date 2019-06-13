package day15_march23;

public class CastingPrimitives {

	public static void main(String[] args) {
		
		// char, short, int, long, float, double, char, boolean
		
		// type conversion ->> casting
		
		//byte -->> int upcasting / type widening
		// this happens implicitly by compiler
		
		byte b = 12;
		int i = b;
		int y = (int)b; //explicitly----by programmer
		
		//int -->> type downcasting / type narrowing
		
		int a = 20 ;
		byte c = (byte) a;
		double d = 12.12;
		int k = (int) d;
		
		System.out.println(k);
		
		// boolean b = (boolean) 10; IT WILL NOT WORK!!!
		
		// char to int 
		
		char c1 = 'A';
		int cNum = c1;
		
		System.out.println(cNum);
		
		
		
		
		
		
		
		
		
	}

}
