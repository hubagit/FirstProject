package day8_march_10;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a = 10, b = 20, c= 10;
        
		boolean b1 = a>b;
		boolean b2 = a>= c;
		
		System.out.println("a is more than b "+ b1);
		System.out.println("a is more than or equal to c "+ b2);
		
		boolean bothMeetReq = b1 && b2;
		System.out.println("are both condition met " + bothMeetReq);
		
		// logical "and" operator &&
		// logical "or" operator ||
		// logical "not" operator !=
	
	}  

}
