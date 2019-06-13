package day32_april23;

public class Utility {

	public static void main(String[] args) {
		
		/// There are two ways to call static methods 
	      /*
	       * 1, if the method is in same class 
	       *     we can just directly call the method by it's name 
	       *       and passing the value it required
	       * 2, or we can use className.staticmethodName(params..)
	       * */
		
		String name = "Mustafa";
		System.out.println(name.length());
//	
//		System.out.println(name.charAt(1));
//		char c = name.charAt(1);
//		System.out.println(c);
		
		giveMe5();
		
		System.out.println(giveMe5());
		System.out.println(Utility.giveMe5());
		
		int myNum = giveMe5();
		System.out.println(myNum);
		
		long mySalary = giveMe6DigitSalary();
		System.out.println(giveMe6DigitSalary());
		System.out.println(2*mySalary);
	 
	
	}

	public static int giveMe5() {
		return 5;
		
		
		
	}
	
	public static long giveMe6DigitSalary() {
		return 100000;
	}
	
	
}
