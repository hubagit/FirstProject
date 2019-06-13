package day54_june1;

public class ProgramminLanguage extends Language {

	public static void main(String[] args) {

	}

//	@Override
//	public void obeyGrammaRule() {
//		System.out.println( "Must obey the syntax rule , are you sure");
//		super.obeyGrammaRule();
//	}
	
//	public final static void display() {
//		System.out.println("display language");
//	}
}

class Language {

	public final void obeyGrammaRule() {
		System.out.println("Must obey the syntax rule");
	}

	public final static void display() {
		System.out.println("display language");
	}
}
