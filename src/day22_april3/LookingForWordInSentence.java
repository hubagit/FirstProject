package day22_april3;

public class LookingForWordInSentence {

	public static void main(String[] args) {
		 String str = "java kava ava";
		 
		 String target = "ava";
		 
		 int firstIndex = str.indexOf(target);
		 int laststIndex = str.lastIndexOf(target);
		 
		 int index =0;
		 
		 while(index<=laststIndex) {
			 
			 index = str.indexOf(target,index );
			 System.out.println("Found at index : "+index);
			 //index+=1;
			 index = index + target.length();
			 
		 }
		 
		 

	}

}
