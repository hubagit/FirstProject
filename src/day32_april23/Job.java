package day32_april23;

public class Job {

	public static void main(String[] args) {

		long myFirstSalary = giveMe6DigitSalary();
		long mySecondSalary = (long) (myFirstSalary + myFirstSalary * 1.1);
		System.out.println(giveMe6DigitSalary());
		System.out.println(myFirstSalary + mySecondSalary);

		System.out.println(isAdultOrNot(21));
		boolean answer = isAdultOrNot(17);
		System.out.println(answer);
		
		int biggerNumber = giveMeBiggerNumber(11, 12);
		System.out.println(biggerNumber);
		System.out.println(giveMeBiggerNumber(110, 120));
		

	}
	public static int giveMeBiggerNumber(int a, int b) {
//		if (a > b)
//			return a;
//		else
//			return b;

		int max = (a>b)?a:b;
		return max;
		
	}
	public static long giveMe6DigitSalary() {
		return 100000L;
	}

	public static boolean isAdultOrNot(int age) {

//		if(age>18)
//			return true;
//		else
//			return false;
		return age > 18;

	}

	
}
