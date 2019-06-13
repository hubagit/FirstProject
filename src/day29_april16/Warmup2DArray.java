package day29_april16;

public class Warmup2DArray {

	public static void main(String[] args) {
		
		
		String [][] pizza= {
		          {"mushroom","black olive","green pepper"},
		              {"spinach","green pepper","mushroom"},
		              {"black olive","black olive","spinach"},
		              {"mushroom","mushroom","red pepper"},
		              {"banana pepper","spinach","red pepper"},
		              {"mushroom","green pepper","green pepper"},
		              {"spinach","green pepper","mushroom"}
		              };
		    
		    //Task 1.5 print all the value inside using for loop and stop eating when you see banana pepper
		    
		    // labels -- used to label certain loop in nested loop 
		    
		    outer:
		    for (int i = 0; i < pizza.length; i++) {
		      
		      System.out.println("Slice number : " + (i+1) );
		      
		      for(int j=0 ; j < pizza[i].length ; j++ ) {
		        
		        if(pizza[i][j].equals("banana pepper") ) {
		          break outer; 
		        }      
		        System.out.print(pizza[i][j] + " | ");
		        
		      }
		      System.out.println();
		    }
		    
		    
		
		
		 System.out.println("---------------------");
		    
		    for (int i = 0; i < pizza.length; i++) {
		      
		      System.out.println("Slice number : " + (i+1) );
		      
		      for(int j=0 ; j < pizza[i].length ; j++ ) {
		        
		        if(pizza[i][j].equals("banana pepper") ) {
		          continue; 
		        }      
		        System.out.print(pizza[i][j] + " | ");
		        
		      }
		      System.out.println();
		    }
		  }

		
	

}
