package day33_april24;

import java.util.Arrays;

public class ReturningMultiplevalue {

	public static void main(String[] args) {

		int[] myArray = giveMeAnArray();
		System.out.println(Arrays.toString(myArray));

		System.out.println(Arrays.toString(giveMeAnArray()));

		double[] arr1 = { 1, 2, 3 };
		double[] arr2 = { 4, 5, 6};
		double[] arr3 = combineArray(arr1, arr2);

		double[] target = new double[] {1,2,3,4,5,6,};
		System.out.println(Arrays.toString(arr3));
		
		if(Arrays.equals(arr3,target))
		System.out.println("Test has passed:)");
		else 
		System.out.println("Test failed!");
	
}

	public static double[] combineArray(double[] d1, double[] d2) {

		int size = d1.length + d2.length;
		double[] combined = new double[size];

//		combined = Arrays.copyOf(d1,d1.length+d2.length);
//		combined = Arrays.copyOf(d2, d2.length);
		
		
		for (int i = 0; i < d1.length; i++) {
			combined[i] = d1[i];
		}

		for (int j = 0; j < d2.length; j++) {
			combined[d1.length + j] = d2[j];
		}

		return combined;
	}

	// this method have no paramter
	// and return int array object as returned value
	public static int[] giveMeAnArray() {

		int[] arr = new int[] { 1, 2, 3 };
		return arr;
		// return Arrays.toString(arr); WRONG!!!
	}
}
