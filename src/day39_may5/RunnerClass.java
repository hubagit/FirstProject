package day39_may5;

public class RunnerClass {

	public static void main(String[] args) {

		// local variable
		// String s = "abc";
		// Creating new Person object
		Person p1 = new Person();
		// setting attributes value of object
		p1.name = "Talmurat";
		p1.age = 1;
		p1.gender = 'M';

		// Creating new Person object
		Person p2 = new Person();
		// setting attributes value of object
		p2.name = "Diana";
		p2.age = 27;
		p2.gender = 'F';

		Horse spartan = new Horse();
		spartan.breed = "Mustang";
		spartan.age = 10;
		spartan.color = "Black";
		spartan.height = 10;
		
		

		System.out.println(spartan.breed);
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		System.out.println("==============Practice==========");

		Person2 p5 = new Person2();
		p5.age = 30;
		p5.name = "Sungur";
		
		System.out.println(p5.name);
		System.out.println(p5.age);
		
		
		
	}
}
