package day40_may7;

import java.util.ArrayList;

public class usingTypeComputer2 {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();
		
		// this collection of objects of our own custom class
		ArrayList<Computer2> computers = new ArrayList<>();
		ArrayList<Computer2> computers2 =new ArrayList<>();
		
		Computer2 mac = new Computer2();
		computers.add(mac);
		
		Computer2 hp = new Computer2();
		computers.add(hp);
		
		// we are adding objects of computer class without reference type
		computers.add(new Computer2());
		computers2.add(new Computer2());
		
		Computer2 imac = getComputer();
		System.out.println(imac.OS);
		
		Computer2 hp1 =getComputer2();
		System.out.println(hp1.color);
		
		computers.add(imac);
		System.out.println(computers.size());
	}

	// this method will return object of computer class
	public static Computer2 getComputer() {
		Computer2 imac = new Computer2();
		imac.OS = "MacOS";
		return imac;

	}
	public static Computer2 getComputer2() {
		Computer2 hp = new Computer2();
		hp.color= "Blue";
		
		return hp;
		
		
		
		
	}
}
