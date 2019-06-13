package day48_may21;

public class Action {

	public static void main(String[] args) {

		// whenever we need to access static members
		// we use Class.static member
		// we are accessing static variable counter through the class name
		int countOfPeople = Person.counter;
		System.out.println("Count of people that generated: " + countOfPeople);

		Person person1 = new Person("Mustafa", 35, 6.4f, 'M');
		Person person2 = new Person("Sungur", 36, 6.2f, 'M');

		// in this case, we are accessing static variable counter through the object
		// person2
		countOfPeople = person2.counter;
		System.out.println(person1);
		System.out.println("============================");
		System.out.println("Count from person1: " + person1.counter);
		System.out.println("Count from person1: " + person1.counter);
		System.out.println("Count from Person class: " + Person.counter);
		// static field counter is a shared property
		// regardless how do you access this property
		// you will get the same value
		System.out.println("============================");
		System.out.println("Citizenship from person1: "+person1.getCitizenship());
		System.out.println("Citizenship from person1: "+person1.getCitizenship());
		System.out.println("Citizenship from Person class: "+Person.getCitizenship());
	}

}
