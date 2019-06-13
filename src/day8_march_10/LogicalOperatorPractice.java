package day8_march_10;

public class LogicalOperatorPractice {

	public static void main(String[] args) {
		
		
		    
		    // Logical and operator && (short-circuit) , &
		      // As long as one operand is false WHOLE THING WILL BE FALSE 
		      // ONLY WHEN both operands are true then WHOLE THING WILL BE TRUE 
		    
		    // Logical or operator || , | 
		      // As long as one operand is TRUE WHOLE THING WILL BE TRUE 
		      // ONLY WHEN both operands are false then WHOLE THING WILL BE FALSE 
		    
		    // Logical NOT operator !
		    
		    // difference between single & | and double && || is 
		      // && will only evaluate first part if the whole result can be decided 
		        // just using the first boolean value 
		      // & will check for both side whether it can be already decided using 
		        // boolean value 
		
		   // logical XOR ^ boolean1 ^ boolean2
		      // if one of the operators is true, result is true
		      // true ^ true -->> false
			  // false ^ false -->> false
			  // true ^ false -->> true
			  // false ^ true -->> true
		      
		    
//		    System.out.println("result of (true && true)  " +  (true && true)  );
//		    System.out.println("result of (false && true) " +  (false && true)  );
//		    System.out.println("result of (true && false) " +  (true && false)  );
//		    System.out.println("result of (false && false) " +  (false && false)  );
//		    
//		    System.out.println("result of (true || true)  " +  (true || true)  );
//		    System.out.println("result of (false || true) " +  (false || true)  );
//		    System.out.println("result of (true || false) " +  (true || false)  );
//		    System.out.println("result of (false || false) " +  (false || false)  );
		    
//		    System.out.println("result of !true " + (!true) );
//		    System.out.println("result of !false " + (!false) );
	
		    
		   // ----------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		    
		    
		    int score = 10 ; 
		    boolean result1 = score > 4 ; //true
		    boolean result2 = score > 4 && score <11; //true
		    
		    boolean result3 = score > 14 && score <11; //false
		    boolean result4 = score > 14 || score <11;  //true
		    
		    //boolean result5 = score++ >10  && score <12;  //10>10 && 11<12
		    //boolean result5 = ++score >10  && score <12;  // 11>10 && 11<12
		    //boolean result5 = score++ >10 || score <12;  // 10>10 ||11<12
		    
		    //boolean result5 = score++ >10 && ++score <13;  // 10>10 false so it will not evaluate next one
		    //boolean result5 = score++ >10 & ++score <13;  // 10>10 & 12<13 
		    
		    boolean result5 = score >10 & ++score <13;  //
		    boolean result6 = !true && true;
		    
		    boolean result7 = (score > 5) && (6 > 5) ;  // TRUE TRUE --- TRUE  
		    boolean result8 = (score > 5) && !(6 > 5) ;  // TRUE FALSE --- FALSE 
		    
		    boolean result9 = (score > 5) && (score > 11) && (score/2 == 5) ;  // TRUE FALSE
		    boolean result10 = (score > 5) && (score <= 11) && (score/2 == 5) ;  // TRUE TRUE TRUE
		   
		  // precedence 
            //FALSE  OR  TRUE AND  TRUE 
          // System.out.println(   score>10 || (score==10 && score >5)     );
		    
//		    System.out.println( "the value of score right now : " + score );
//		    System.out.println("result is " + result1    );
//		    System.out.println("result is " + result2    );
//		    System.out.println("result is " + result3    );
//		    System.out.println("result is " + result4    );
//		    System.out.println("result is " + result5    );
		    
		    System.out.println(true || false && true);
		    System.out.println(score>10 || (score == 10 && score<5));


}

}
