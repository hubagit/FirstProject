package day8_march_10;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		
		// logical "and" operator &&, &
		   // if one of operands is false, result is FALSE
		   // if both true, result is TRUE
		
		// logical "or" operator ||, |
		   // IF ONE OF OPERANDS IS  true, result is TRUE
		   // IF BOTH FALSE, RESULT IS FALSE
		
		// logical "not" operator !
		
		  // difference between single & | and double && || is 
	      // && will only evaluate first part if the whole result can be decided 
	        // just using the first boolean value 
	      // & will check for both side whether it can be already decided using 
	        // boolean value 
	      
		
		System.out.println("result of " + (true && true));
		System.out.println("result of " + (false && true));
		System.out.println("result of " + (true && false));
		System.out.println("result of " + (false && false));
		
		System.out.println("result of " + (true || true));
		System.out.println("result of " + (false || true));
		System.out.println("result of " + (true || false));
		System.out.println("result of " + (false || false));
		
		System.out.println("result of " + (!true));
		System.out.println("result of " + (!false));
		
		
		
		
		

	}

}
