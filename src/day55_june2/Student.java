package day55_june2;

//abstract classes are not meant to be instantiated (cannot create an object)
//abstract classes are meant to be a super class
//to provide a general idea, without providing implementation details
//using abstract method

//Other than above
//you can have everything else, a normal class can have

public abstract class Student {

	// abstract class can have both instance and static fields
	int id;
	String name;
	public static final String SCHOOL = "Cybertek";

	// we can have constructor in abstract class
	// the whole purpose is to provide reusable code
	// for sub class constructor
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// we can have non-abstract instance method
	// sub class has the option to directly use it
	// or it has option to override the method
	public void study() {
		System.out.println("Study hard to get the job");
	}

	// can have static method
	// sub class has the option to use as is
	// or hide it with same method

	// static method can not be abstracted at ALL
	public static void showSchool() {
		System.out.println(SCHOOL);
	}

	// abstract method can be defined only in abstract class
	// it must have keyword abstract
	// and it must not have body
	// it ends with <;>

	public abstract void attendClass();

//	public void attendClass() {
//		System.out.println("Implement in sub classes");
//	}

}
