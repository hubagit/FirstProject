package day47_may19;

import java.util.Random;

public class BlockRunner {

	public static void main(String[] args) {

		System.out.println("Hello World");

		InstanceBlock b1 = new InstanceBlock();

		System.out.println(" -------- " + b1.num);
		InstanceBlock b2 = new InstanceBlock("Jon Snow");

		System.out.println(" -------- " + b2.num);

		InstanceBlock b3 = new InstanceBlock();
		InstanceBlock b4 = new InstanceBlock();
		InstanceBlock b5 = new InstanceBlock();

		Random r = new Random();
		int i = r.nextInt(100);
	}

}
