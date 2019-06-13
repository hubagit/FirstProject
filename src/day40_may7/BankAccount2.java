package day40_may7;

public class BankAccount2 {

	double balance;
	String accountHolder;

	public void showAccountHolder() {
		System.out.println("Account holder name is " + accountHolder);
	}

	public void showBalance() {
		System.out.println("Account balance: " + balance);

	}

	// deposit
	public void deposit(double amount) {
		balance = balance + amount;
	}

	// withdraw
	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void add100Dollars() {
		balance = balance + 100;
	}

	public void printInfo() {
		System.out.println("Customer: " + accountHolder + ", Balance: " + balance + "$");
	}

	// create 2 instance fields balance, accountHolder
	// then create a non static method showAccountHolder()
	// this method will have void return type
	// and will just print account holder name
	// create a method showBalance(), it will not take any parameters
	// it will print balance
	// optional: create a method that will add 1$ to the balance
	// create a class called BankActivity
	// set account holder name
	// and set balance
	// call showBalance() and showAccountHolder() inside that class
}
