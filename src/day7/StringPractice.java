package day7;

public class StringPractice {

	public static void main(String[] args) {
		
		//the output expected is -->> I love "Java"
		String name = " I love \"Java\"";
		System.out.println(name);
		
		//the output expected is -->> I love \Java
		String name2 = " I love \\Java";
		System.out.println(name2);
		
		String sentence = "\"Stay Positive\"";
		System.out.println(sentence);
		
		//in order to have quotation inside your string
		//you need to add \ before telling compiler it s not end of string
		//but just treat as a normal quotation char
		//\" will generate " in the output
		// same goes for \ itself -->> \\ will generate \ in the output
		
		
		String name3 = "Mustakil";
		System.out.println("My name is \"" + name3 + "\"");
		
		System.out.println("Java is\ncool");
		
		
		
		
		
		
		

	}

}
