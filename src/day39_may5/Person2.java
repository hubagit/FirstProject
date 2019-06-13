package day39_may5;

public class Person2 {

	String name;
	int age;
	char gender;

	public void tellYourInfo() {
		System.out.println("My name is " + name + " my age is " + age + " my gender is " + gender);

	}

	public static void main(String[] args) {

		Person2 p2 = new Person2();
		p2.name = "Mustafa";
		p2.age = 35;
		p2.gender = 'M';

		Person2 p3 = new Person2();
		p3.name = "Zuha";
		p3.age = 34;
		p3.gender = 'F';

		Person2 p4 = new Person2();
		p4.name = "Zehra";
		p4.age = 6;
		p4.gender = 'F';
		
		p2.tellYourInfo();
		p3.tellYourInfo();
		p4.tellYourInfo();

		/*
		 * Horse: properties: color, age, breed behaviors: jump, eat, run, kick
		 * 
		 * Person: properties: name, age, gender behaviors: eat, study, laugh, sleep
		 * 
		 * 
		 */

//		String str = new String("abc");
//		Scanner scan = new Scanner(System.in);
//		Random ran = new Random();

	}

}
