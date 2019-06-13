package day52_may28;

public class School {

	public static void main(String[] args) {

		Student student1 = new Student("Firuz", 36, 'M', 1);
		System.out.println(student1);
		
		// Student [name=Firuz, age=36, gender=M, student_id=1] toString() only in
		// Student
		// Person [name=Firuz, age=36, gender=M] - toString() only in Person
		// day52_night_session.Student@7852e922 - no toString()
		
		StudentOnCampus studentoncampus1 = new StudentOnCampus("Mensulu", 18, 'F', 2);
		StudentOnline studentonline1 = new StudentOnline("Manzire", 33, 'F', 3);
		
		System.out.println(studentoncampus1);
		System.out.println(studentonline1);
		
		studentoncampus1.goToCampus(); // this method is coming from StudentOnCampus
		studentoncampus1.goToCampus(); // No need to go anywhere, already here.
		
		System.out.println("Counter: " + Person.getCounter());		
		System.out.println("PI: " + Math.PI);
		
//	    Student.SCHOOL_NAME = "Rival IT SDET School";
		System.out.println(Student.SCHOOL_NAME);
	}

}
