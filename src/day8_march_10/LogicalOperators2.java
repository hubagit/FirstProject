package day8_march_10;

public class LogicalOperators2 {

	public static void main(String[] args) {
		
		boolean isHungary = true;
		boolean isBreakTime = false;
		boolean isYourLunchReady = true;
		
		System.out.println("Are you both hungary and is it break time "
		                   +(isHungary && isBreakTime));
		
		System.out.println("Are you both hungary and is it break time "
                +(isHungary || isBreakTime));
		
		boolean reverseISHungary =! isHungary;
		System.out.println("Original is hungary "+ isHungary);
		System.out.println("After reversing is hungary "+ reverseISHungary);
		
		
		boolean areWeSuperReady = isHungary && isBreakTime && isYourLunchReady;
		System.out.println("hungary, break time, meal is ready " + areWeSuperReady);
		
		
		

	}

}
