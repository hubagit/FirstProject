package day42_may11;

public class Employee {

	// 4 access modifier to restrict access to members of the class
	// public accessible anywhere
	// protected stay tuned for later
	// default only in same package -- package private
	// private only in same class

	// instance variable -->> used to define properties | attributes of the objects
	String name;
	int age;
	String title;
	double salary;
	// instance methods --->>
	// used to read or manipulate the properties | attributes of the objects

	public void printAllInfo() {
		System.out
				.println("name is <" + name + "> age is <" + age + "> title is <" + title + "> salary is => " + salary);

	}
	
	String name1;
	int age1;
	double salary1;
	
	public void printAllInfo1() {
		System.out.println("name is: "+name1+"\nage is: "+age1+"\nsalary is: "+salary1);
		
		
		
		
	}
	
	

}
