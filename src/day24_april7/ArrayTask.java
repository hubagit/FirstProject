package day24_april7;

public class ArrayTask {

	public static void main(String[] args) {
	
		char[] myName = {'m','u','s','t','a','f','a'};
		char[] myName2 = new char[7];
		myName2[0] = 'm';
		myName2[1] = 'u';
		myName2[2] = 's';
		myName2[3] = 't';
		myName2[4] = 'a';
		myName2[5] = 'f';
		myName2[6] = 'a';
		char[] myName3 = new char[] {'m','u','s','t','a','f','a'};
		
		System.out.println(myName);
		System.out.println(myName2);
		System.out.println(myName3);
		
		for (int i = 0; i < 7; i++) {
			System.out.print(myName[i]);
		}
		
		System.out.println();
		for (int i = 0; i < myName.length; i++) {
			System.out.print(myName[i]+" ");
		}
	System.out.println();
		char[] myName4 = {'m','u','s','t','a','f','a'};
	
		//how do we get last items
		int count = myName4.length;
		
		System.out.println("item in the last index: "+ myName4[count-1]);
		 
		//how do we get the one in the middle
		
		int midIndex = count/2;
		System.out.println("item in mid index: "+myName4[midIndex]);
		
		for (int i = count-1; i >=0; i--) {
			System.out.print(myName4[i]+" ");
		}
		
	}

}
