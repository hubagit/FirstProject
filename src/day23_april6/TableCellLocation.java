package day23_april6;

public class TableCellLocation {

	public static void main(String[] args) {

		for (int row = 1; row < 4; row++) {

			// System.out.println("Row: " + i);
			for (int col = 1; col < 5; col++) {
				System.out.print("Cell" + "(" + row + "," + col + ") ");
			}

			System.out.println();
		}

	}

}
