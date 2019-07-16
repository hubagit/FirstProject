package muhtars_Notes;

public class Notes_2 {

}
interface AA{
	
	default void method1() {
		
	}
//	public void method2() {
//		
//	}
	
		public void method3();
		abstract public void method4();
	
}

abstract class zz{
	
//	@Override
//	protected void finalize() throws Throwable {
//		super.finalize();
//	}
	
	
	zz(){
		
	}
	 public void method3() {
		 
	 }
	 abstract public void method4();
	
}

 class day02  {
	
	 public final static void main(String... pizza) {
			
	/*
	 
	 					a = a+b;
		 				b= a-b;
		 				a = a-b ;
	 */
	
				int a=10;
				int b=20;    // a =20, b=10;
				
//				a = a+b;  //30
//				b= a-b;   // 10;
//				a = a-b;  //20;
				
				a= a^b;  
				b= a^b;
				a=a^b ;
				
	System.out.println(a+" "+b);
	
	 }
}
		/*
		 	
		 	1. how did you use inheritance in your framework?
		 			reusable. 
		 			ex: instaed of creating webdriver 1000 times for 1000 test cases, 
		 				we only declare it once in a utility class and inherit in the test classes.
		 				
		 					WebDriver driver = new ChromeDriver();
		 					driver.get(URL);  // get() is override method
		 					
		 	
		 	2. abstract class vs interface?
		 	
		 			1. how to create an object from abstract class and interface?
		 						Cannot create object from both interface and abstract class
		 			
		 			2. can u implement multiple interfaces to an abstract class?
		 				yes, any class can implement multiple interfaces
		 			
		 			3. can abstract class be static?
		 					no
		 					
		 			
		 			4. can you have finalize method in an interface?
		 					No, interface can only have: default, abstract, static
		
		 	
		 	3. how to swap two numbers without using third variable?
		 				a = a+b;
		 				b= a-b;
		 				a = a-b ;
		 				
		 	4. can we have multiple classes in a single file?  Yes
		 			can we have multiple public classes in a single file? 
		 				no, we can only have one public class ina single file		 					
		 	
		 	5. what access modifiers can be used for class?
		 				public and default.
		 	
		 	
		 	6. can main method have final keyword? 
		 			yes
		 			
		 		can main method have protected access modifier? 
		 				No, Only can have public access modifiers
		 	
		 	
		 	7. how can we monitor JVM in a production Environment?
			 		JConsole
			 		it's one of the monitoring tool that compiles to the 
			 		JMX (Java Management Extension).
		 
		 /*
		  Assignemnt:  1. create a method that can sort the array in Descending order
		  						Do not use sort methods
		  */