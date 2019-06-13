package day38_may4;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {
		/*
		 * TASK 1 : Create an ArrayList of integer from 1-100
		 * 
		 * get the sum of the each items get the average
		 * 
		 * Create another list that contain items from 100- 1 get the count of numbers
		 * divisible by 3 and 5
		 * 
		 * 
		 * Combine above 2 lists -- add everything from 2nd list to first one
		 * 
		 */
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			list.add(i);

		}
//		for(int eachNum: list) {
//			sum+=eachNum;
//		}
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		int average = sum / list.size();
		System.out.println(list);
		System.out.println(sum);
		System.out.println(average);

		ArrayList<Integer> list2 = new ArrayList<>();
		int count = 0;
		for (int i = 100; i > 0; i--) {
			list2.add(i);

		}
//		for (int eachNum : list2) {
//			if (eachNum % 15 == 0)
//				count = count + 1;
//
//		}
		for (int i = 0; i < list2.size(); i++) {
		if(list2.get(i)%3==0 || list2.get(i)%5==0)
			count++;
		}

		System.out.println(list2);
		System.out.println("The count of numbers divisible by 3 or 5 is " + count);

		

	}

}
