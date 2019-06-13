package day42_may11;

import java.util.ArrayList;

public class EmployeeActions2 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Abdul";
		e1.age = 100;
		e1.title = "Project Manager";
		e1.salary = 120000.01;

		Employee e2 = new Employee();
		e2.age = 23;
		e2.name = "Makintosh";
		e2.salary = 99000.0;
		e2.title = "Dev";

		Employee e3 = new Employee();
		e3.name = "mavlida";
		e3.age = 28;
		e3.title = "Senior QA";
		e3.salary = 100000;

		Employee e4 = new Employee();
		e4.name = "Enser";
		e4.age = 24;
		e4.title = "CEO";
		e4.salary = 3000000;

//		Employee e5 = new Employee();
//		e5.name = "Sungur";
//		e5.age = 35;
//		e5.title = "SDET";
//		e5.salary = 57000;

		// ArrayList<String> names = new ArrayList<>();
		ArrayList<Employee> myPeople = new ArrayList<>();
		myPeople.add(e1);
		myPeople.add(e2);
		myPeople.add(e3);
		myPeople.add(e4);
		myPeople.add(new Employee());

//		ArrayList<Employee> myList = new ArrayList<>();
//		myList.add(e5);
//		myList.add(new Employee());
//
//		for (int i = 0; i < myList.size(); i++) {
//			Employee myEmployee = myList.get(i);
//			//mylist.get(i).printAllInfo; 
//			myEmployee.printAllInfo();
//		}

		for (int i = 0; i < myPeople.size(); i++) {

			// store each item -- Employee Object
			Employee each = myPeople.get(i);
			// calling method using this variable
			each.printAllInfo();

			// myPeople.get(i).printAllInfo();

		}

//		for (int i = 0; i < myPeople.size(); i++) {
//			if(myPeople.get(i).salary>100000)
//				myPeople.get(i).printAllInfo();
//		}

//		int count = 0;
//		for (int i = 0; i < myPeople.size(); i++) {
//			if (myPeople.get(i).age < 30)
//				count++;
//		}
//		System.out.println(count);

//		String myNames = "";
//		for (Employee eachName : myPeople) {
//			if (eachName.age > 25)
//				myNames += eachName.name + " ";
//
//		}
//		System.out.println(myNames);
		
//		for(int i = 0; i<myPeople.size(); i++) {
//			Employee eachEmployee = myPeople.get(i);
//			
//			if(eachEmployee.name!=null && myPeople.get(i).age<100)
//				eachEmployee.salary+=20000;
//			eachEmployee.printAllInfo();
//			
//		}

		System.out.println("\n---// PRINT OUT EMPLOYEES THAT MAKE MORE TNAN 100K --------");

		for (int i = 0; i < myPeople.size(); i++) {

			// store each item -- Employee Object
			Employee each = myPeople.get(i);

			if (each.salary >= 100000) {
				// calling method using this variable
				each.printAllInfo();
			}
			// myPeople.get(i).printAllInfo();

		}

		System.out.println("\n------// COUNT EMPPLOYEE THAT YOUNGER THAN 30 ---------");
		int youngFolkCount = 0;

		for (Employee each : myPeople) {

			if (each.age < 30)
				youngFolkCount++;

		}
		System.out.println(" young 25 year old Folk Count is  " + youngFolkCount);

		System.out.println("\n------// SAVE THE NAME OF ALL EMPLOYEE \n"
				+ "    // WHO ARE MORE THAN 25 INTO A String VARIBALE NAMES---------");

		String names = "";

		for (int i = 0; i < myPeople.size(); i++) {

			Employee each = myPeople.get(i);
			if (each.age > 25) {
				names = names + each.name + ",";
			}

		}

		System.out.println("\n------more than 25---------\n" + names);

		System.out.println("\n------Raise the salary of Employee with name who is younger than 100 by 20K---\n");
		for (int i = 0; i < myPeople.size(); i++) {

			Employee each = myPeople.get(i);

			if (each.name != null && each.age < 100) {

				each.salary += 20000;
				each.printAllInfo();
			}

		}

	}

}
