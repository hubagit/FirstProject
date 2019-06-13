package day40_may7;

public class BankActivityClass {

	public static void main(String[] args) {
		
		BankAccount customer1 = new BankAccount();
		customer1.accountHolder ="Mustafa";
		customer1.balance = 2935.6;
		
		customer1.showbalance();
		customer1.showAccountHolder();
		customer1.add100Dollar();
		customer1.showbalance();
		
		customer1.addDollar(-500);
		customer1.showbalance();
		
		System.out.println("======================");
		
		BankAccount customer2 = new BankAccount();
		customer2.accountHolder ="Sungur";
		customer2.balance = 2500;

		
		customer2.showAccountHolder();
		customer2.showbalance();
		customer2.add100Dollar();
		customer2.showbalance();
		
		customer2.addDollar(100);
		customer2.showbalance();
		
		System.out.println("=======================");
		
		BankAccount customer3 = new BankAccount();
		
		customer3.accountHolder="Sari";
		customer3.balance = 300;
		
		customer3.showAccountHolder();
		customer3.showbalance();
		customer3.addDollar1(50);
		customer3.showbalance();
		
		
	}

}
