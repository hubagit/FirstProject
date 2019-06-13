package day54_june1;

public class FinalLocalVariable {

	public static void main(String[] args) {

		// can not reassign a value for final variable
		// a primitive type store value directly so final variable
		// x can not have new value here

		final int x = 10;
		// x = 12; does not work

		// a reference variable stores address of the object
		// once it's pointed to the object. it can not point to
		// different object
		final Building b1 = new Building(100);
		b1.num = 200;

		// b1 = new Building(300); can not do this
		
		Building b2 = b1;
		System.out.println(b1.num);
		b2=new Building(300);
		System.out.println(b2.num);
	}

}

class Building {

	int num;

	public Building(int num) {
		this.num = num;
	}

}
