package day60_june12;

public class Smart_TV extends TV {

	int channelCount = 200;

	@Override
	public void play() {
		System.out.println("playing smart TV!");
	}

	@Override
	public int getChannelCount() {
		return channelCount;

	}
	public static void doTVStatic() {
		System.out.println("do TV Static");
	}
	// this is how compiler see the inherited method
	// if no change is made to the method
	// you have this method with body that call super class version
	// That's the reason we got 100 if we did not override the method
//	@Override
//	public int getChannelCount() {
//		return super.getChannelCount();
//	}

	public static void main(String[] args) {

		//list<String> myLis = new ArrayList<>();
		TV tv1 = new Smart_TV();
		tv1.play(); // new Smart_TV().play();

		System.out.println(tv1.channelCount);
		System.out.println(tv1.getChannelCount());

		System.out.println(new Smart_TV().getChannelCount());
		tv1.doTVStatic();

	}
}
