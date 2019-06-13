package day31_april20;

public class Calculator2 {

	public static void calculator(char operator, int firstNum, int secondNum) {

		switch (operator) {
		case '+':
			System.out.println("Result of additon is : " + (firstNum + secondNum));
			break;

		case '-':
			System.out.println("Result of sbtraction is : " + (firstNum - secondNum));
			break;
		case '*':
			System.out.println("Result of multiplication is : " + (firstNum * secondNum));
			break;
		case '/':
			System.out.println("Result of division is : " + (firstNum / secondNum));
			break;
		case '%':
			System.out.println("Result of mod is : " + (firstNum % secondNum));
			break;
		default:
			System.out.println("Invalid operator!");
			break;
		}

	}

	public static void main(String[] args) {
		/*
		   * OPTIONAL :
		   * calculate method that takes 3 paramEters and do below 
		   *  
		   * calculate("+" , 100, 30)  -- print 130
		   * calculate("-" , 100, 30)  --  print 70
		   * calculate("*" , 100, 30)  -- print 3000
		   * calculate("/" , 100, 30)  -- print 3
		   * calculate("%" , 100, 30)  -- print 10
		   * calculate("abc" , 100, 30)  -- print INVALID OPERATION CODE

		   * */
		calculator('+', 100, 30);
		calculator('-', 100, 30);
		calculator('*', 100, 30);
		calculator('/', 100, 30);
		calculator('%', 100, 30);
	}

}
