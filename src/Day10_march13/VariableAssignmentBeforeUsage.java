package Day10_march13;

import java.util.Scanner;

public class VariableAssignmentBeforeUsage {

	public static void main(String[] args) {
		
		int i=0;
		// local variables must be assigned to a value before usage
				// If local variable has a single chance 
					//to not get a value before usage , 
					// compiler will not compile the code 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("do yo want to give valeu to i?");
		String yesNoAnswer = scan.next();
		
		//if(yesNoAnswer.equals("yes"))
		if (yesNoAnswer.equalsIgnoreCase("yes")){
			System.out.println("You said yes");
			System.out.println("Enter your number: ");
			i = scan.nextInt();
		}else {
			System.out.println("You said no!");
		}
		System.out.println("The value of i: "+ i);

	}

}
