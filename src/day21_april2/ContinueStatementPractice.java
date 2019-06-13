package day21_april2;

public class ContinueStatementPractice {

	public static void main(String[] args) {

		// odds numbers -->>

//		for (int i = 1; i <= 50; i += 2) {
//			System.out.print(i + " ");
//		}
//		
//		for (int i = 0; i <=50; i++) {
//			
//			if(i%2==1)
//			System.out.print(i+" ");
//		}
		for (int i = 0; i <= 50; i++) {

			if (i % 2 == 0) {
				continue;
			}
				
				System.out.print(i + " ");
		}

		

	}

}
