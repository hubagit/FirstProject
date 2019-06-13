package day54_june1;

public class WarmUp {

	int num = 100;
	//num = 200;// doesn't compile

	//System.out.println("a statement"); //cannot happen
	{
		//num = 150;
		System.out.println("init block 1 ");
	}
	{
		//num = 150;
		System.out.println("init block 2 ");
	}

	public WarmUp() {
		//num=150;
		num = 200;
	}

	public WarmUp(int x) {
		//num=150;
		num = 400;
	}

	public static void main(String[] args) {

		WarmUp w = new WarmUp();
		System.out.println(w.num);

	}
}
