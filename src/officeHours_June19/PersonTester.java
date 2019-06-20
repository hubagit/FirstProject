package officeHours_June19;

public class PersonTester {

	// a method that returns a Person object
	public Person getPerson() {
		System.out.println("PersonTester getPerson");
		return new Person();
	}

	public long getNumber() {
		System.out.println("PersonTester getNumber");
		return 100l;
	}

}

class DoctorTester extends PersonTester {

	// @Override
	// public Person getPerson() {
//	    System.out.println("DoctorTester getPerson");
//	    return  new Doctor(); 
	// }
	// overriding method can have sub class type
	// of super class return type
	// this is called covariant return type
	@Override
	public Doctor getPerson() {
		System.out.println("DoctorTester getPerson");
		return new Doctor();
	}
	@Override
	public long getNumber() {
		System.out.println("PersonTester getNumber");
		return 10;
	}
}
