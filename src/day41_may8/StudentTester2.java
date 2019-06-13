package day41_may8;

public class StudentTester2 {

	public static void main(String[] args) {

		Student2 emine = new Student2();
		emine.setSSN(123456789);
		//filed is not visible because it's private instance
		//emine.ssn
		
		emine.batchNumber=11;
	}

}
