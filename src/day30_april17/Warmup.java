package day30_april17;

public class Warmup {

	public static void main(String[] args) {
		 /*
		  WARM UP 
		  1, Create a static method 
		  called  sayHello : 
		  this method return nothing 
		  and does not take any parameter

		  and it will greeting spartan 

		  2, Create a static method 
		  called  sayGoodBye : 
		  this method return nothing 
		  and does not take any parameter

		  and it will good bye spartan 

		  3, Create a static method 
		  called  sayHelloTo : 
		  this method return nothing 
		  and take 1 String name as parameter

		  and it will greeting --the Name You passed 
		   */
		sayHello();
		sayHello();
		// calling static method 
        // ClassName.staticMethodName(); 
        // if the method is in same class --> staticMethodName();
		sayGoodBye();
		Warmup.sayGoodBye();
		sayHelloTo("Mustafa");
		Warmup.sayHelloTo("Jon Snow");

	}

	public static void sayHello() {
		String greeting = "Hi Spartan!";
		System.out.println(greeting);
		
		
	}

	public static void sayGoodBye() {
		String word = "Good Bye Spartan!";
		System.out.println(word);
	}

	public static void sayHelloTo(String name) {
		System.out.println("Hello "+name);
		
		
		
		
	}

}
