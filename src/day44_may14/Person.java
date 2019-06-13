package day44_may14;

public class Person {

	// call POJO
	// review of constructor topic
	// these variables encapsulated
	// because, they are private and not accessible outside current class
	private String name;
	private String email;
	private int age;

	// this is constructor
	// without arguments
	public Person() {
		System.out.println("Contructor 1");
		// when we will create an object
		// every object by default will have these values
		this.name = "unknown";
		this.email = "there.is.no.email.yet@email.com";
	}

	// we can overload constructor
	public Person(String name, String email, int age) {
		// how to define these values?
		System.out.println("Contructor 2");
		this.name = name;
		this.email = email;
		this.age = age;
	}

	// one more constructor
	public Person(String name, String email) {
		// how to define these values?
		System.out.println("Contructor 3");
		this.name = name;
		this.email = email;
	}

	// instead of hashcode, we want to get nice formated output
	public String toString() {
		return "Person [ name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}
