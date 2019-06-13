package day17_march26;

public class WhileLoopPractice {

	public static void main(String[] args) {

		//int x = 0;

		// how many times iterations we have is 6
//		while (x<=10) {
//			System.out.println("all even numbers ;" +x);
//			x+=2;
//		}

		// how many times iterations we have is 11
//		while (x<11) {
//			if (x%2==0   ) {
//				System.out.println("all even numbers ;" +x);
//			}
//			x++;
//			
//		}

//		x = 51;
//		
//		while(x<=100) {
//			System.out.println("Value of x is : "+ x);
//			x +=2;
//		}

		// OPTIONAL TASK : print only even number between 50-70
		// and odd number for the rest in one while loop

		int x = 50;

		while (x <= 100) {
			if (x<=70 && x%2==0) {
				System.out.println("Even values of x: "+ x);
				x++;
			} //else if ( x>70 && x%2==1){
//				System.out.println("Odd values of x: "+x);
//				
//			}
			
		
		}

	}

}
