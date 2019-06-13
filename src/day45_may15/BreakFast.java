package day45_may15;

public class BreakFast {

	public static void main(String[] args) {
		Iftar va = new Iftar("Polo", "8:16pm", "water");

		Iftar tx = new Iftar("Laghman", "8:24pm", "Coke");

		Iftar ca = new Iftar("kekbab", "8:15pm", "Ayran");

		System.out.println(va);
		System.out.println(tx);
		System.out.println(ca);

	}

}
