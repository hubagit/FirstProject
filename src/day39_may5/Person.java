package day39_may5;

public class Person {

	// properties of the object are defined by instance variable
	// or instance field
	String name;
	int age;
	char gender;

	// public static void eat(){
	// any non-static method is called instance method

	public void eat() {
		System.out.println("eating");

	}

	public void tellMeYourname() {

		System.out.println("My name is " + name);

	}

	public void printPersonInfo() {
		System.out.println("My name is " + name
				+ " |My age is " + age 
				+ " | my genger is " + gender);

	}

}
