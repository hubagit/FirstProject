package day11_march16;

public class VaribaleScope {

	public static void main(String[] args) {
		
		// variable scope = where you can access piece of data you declared
		
		int x = 10;
		
		if (x==10) {
			
			System.out.println("Yes 10 ");
			
			int y = 2;
			System.out.println(y);
			
		}
		// out of scope
		//
		// System.out.println(y); it won't compile!!!
		System.out.println(x);
		
		
		
	}

}
