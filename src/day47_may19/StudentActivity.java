package day47_may19;

//import is used to import the type that is not under the package 

//static import 
//-->> is used to import the visible static members of another class 
// we use keyword import static yourClasname.staticMember; 
// just like importing the class, we can use .* to import all static members


import static day47_may19.StudentsUtility.displayAllStudent;
import static day47_may19.StudentsUtility.*;




public class StudentActivity {

	public static void main(String[] args) {
		
		

		// StudentsUtility.displayAllStudent();
		displayAllStudent();
		System.out.println("---------------");
		addOneStudent("Tugba");
		addOneStudent("Sheroz");
		displayAllStudent();

		System.out.println("---------------");
		updateStudent(11, "Sheroz Zoidov");
		displayAllStudent();

		System.out.println("---------------");
		removeStudent(6);
		displayAllStudent();

		System.out.println("---------------");
		resetTheList();
		displayAllStudent();

	}

}
