package day23_april6;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {

		// dataType[] variableName = new dataType[4];
		// dataType varaibelName[] = new dataType[4];

		double[] price1;
		price1 = new double[4];

		price1[0] = 1.5;
		price1[1] = 2.12;
		price1[2] = 23.99;
		price1[3] = 12.32;

		System.out.println(price1[2]);

		// double price2[] ;
		// the number in [] is the capacity of array object
		
		boolean[] b1 = new boolean[5];
		short[] sh1 = new short[2];
		String[] str = new String[20];
		Scanner[] scan = new Scanner[5];
	}

}
