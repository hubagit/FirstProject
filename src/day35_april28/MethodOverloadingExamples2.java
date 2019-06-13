package day35_april28;

public class MethodOverloadingExamples2 {

	public static void main(String[] args) {

		//add(10, 12);
		//add(10L, 12L);// 10L can be upcasted to 10D, but not 12L to 12 as int
		
		//add(10d,(byte)12);
		
		
		add(9, 9.5);
		add(9, 10d);
		
		//ambiguous method call error
		//add(9, 9);
		
		add(300d, 9);
		add(300, 9d);
	}

	public static void add(double a, int b) {

		System.out.println("add(double a, int b) ");

	}
	public static void add(int a, double b) {

		System.out.println("add(int a, double b) ");

	}
}
