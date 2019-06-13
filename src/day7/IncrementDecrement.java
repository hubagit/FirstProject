package day7;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		
		
		//if ++ comes after the variable name -->> post increment
		//it means increase the value and only reflect the change next time
		//the variable showed up again
		
		//if ++ comes before the variable name -->> pre increment
				//it means increase the value right away and 
		        //reflect the change next timeright away
		
		int x = 3;
//		x = x++; //-->> x=3
//		x = ++x; //-->> x=4
//	
		//int result = x++ + 5; //3+5
		//int result = ++x + 5; // 4+5
		//System.out.println(result);
		
		//x = x++ + ++x; // 3 + 5
		
		x = x++ + --x + x-- + x; //3+3+3+2
		
		System.out.println(x); //4
		
		
		// System.out.println(x++);
		//System.out.println(++x); // increment the value and reflect right away
		//System.out.println(x); // no change
		//System.out.println(x); // no change
		
		//System.out.println(x--); // post-decrement
		//System.out.println(--x); // pre-decrement
		//System.out.println(x);
		
		
		
		
		

	}

}
