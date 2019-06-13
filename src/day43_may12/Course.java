package day43_may12;

public class Course {

	String name;
	int courseID;

	// constructor
	// ---> a special method that is being called whenever an object is created
	// it has same name as class name
	// it has no return type ---(this does not mean return type is void)

	// if you don't explicitly create one like below
	// compiler will add an empty constructor for you
	// because we can not call something we don't have
	// we call it default constructor

	// modify this constructor
	// if any object is being created
	// using no-arg constructor
	// the first name should be set to unknown
	// the course Id should be set to 100

	public Course() {
		//this.name = "unknown";
		//this.courseID = 100;
		System.out.println("Course constructor");
	}

	public Course(String name) {
		this.name = name;
		System.out.println("passing argument");
	}

	// This is not a constructor
	// it should not have return type
	// and it has to have same name as Class name
	// public void Course() {
	//
	// }

	// create another constructor with 2 parameters
	// and create object using that constructor
	public Course(String name, int courseID) {
		this.name = name;
		this.courseID = courseID;
		System.out.println("name and courseID");
	}

}
