package day26_april10;

public class SwapVariableValueWithNotemp {

	public static void main(String[] args) {

		int x = 10, y = 20;
		System.out.println(x + y);
		x = x + y;
		y = x - y;
		x = x - y;

	}

}
