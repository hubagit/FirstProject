package day20_march31;

public class DoWhileSum {

	public static void main(String[] args) {

		int x = 1;
		int sum = 0;
		
		do {
			sum += x;
			x++;
			if(sum>40) {
				break;
			}
		} while (x < 11);
		
		System.out.println(sum);
	}

}
