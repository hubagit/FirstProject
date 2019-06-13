package day40_may7;

public class BankAccount {

	// 2 instance variable/filed
	String accountHolder;
	double balance;

	// create an instance method(Non-static method)
	// called showAccountHolder accept no parameter and return nothing
	// ==> printOutAccount Holder name

	public void showAccountHolder() {
		System.out.println("Account: " + accountHolder);
	}
	// create an instance method showBalance accepts no parameter
	// and return nothing

	public void showbalance() {

		System.out.println("balance: " + balance);
	}
	// optional
	// create an instance method called add100Dolar doesn't accept any parameters
	// and return no value
	// increase the balance of the account by 100.

	// adding 100 to balance current value
	public void add100Dollar() {
		balance += 100;

	}

	// create another class called BankActivity with main method
	// create bank account object
	// set account holder name and balance value
	// call your showAccountHolder and showBalance method
	// optionally call your add100Dollar
	// and call your showBalance method again to see whether balance has changed

	// adding <custom> amount dollar to current balance
	public void addDollar(int amount) {

		balance += amount;
	}
	public void addDollar1(int i) {
		balance = balance+i;
		
		
		
	}

}
