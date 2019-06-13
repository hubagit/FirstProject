package day19_march30;

public class DoWhileLoop {

	public static void main(String[] args) {

		// while loop
		// do while
		// for loop //for each loop

//		int x = 1;
//		while (x < 6) {
//			System.out.println(x++);
//		}
		/*
		 * do { action to be repeated } while (a condition is true);
		 * 
		 * COMPARE TO WHILE LOOP Do While Loop check the condition after the first
		 * iteration
		 */

//		int y = 1;
//
//		do {
//			System.out.println(y++);
//		} while (y < 5);

		int x = 1;
		do {
			System.out.print(x++ +" ");
		} while (x<6);
		 /*        y     y after iteration   
	     * iter 1  --   1       2               2<=5
	     * iter 2  --   2       3               3<=5
	     * iter 3  --   3       4               4<=5
	     * iter 4  --   4       5               5<=5
	     * iter 5  --   5       6               6<=5
	     * */
	   
		
		
		System.out.println();
		System.out.println("x value: "+x);
		do {
			System.out.print(--x + " ");
		} while (x>1);
		
		/*        y     y after iteration   
	     * iter 1  --   5      5>1             
	     * iter 2  --   4      4>1       
	     * iter 3  --   3      3>1       
	     * iter 4  --   2      2>1       
	     * iter 5  --   1      1>1       
	     * */
		
	}

}
