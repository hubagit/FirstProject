package day51_may26;

public class SavingAccount extends BankAccount {
//	String accountName;
//	long accountNumber;
//	double balance;

	double returnRate;

	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {

		super(accountName, accountNumber, balance);
//		this.accountName = accountName;
//		this.accountNumber = accountNumber;
//		this.balance = balance;
		this.returnRate = returnRate;
	}

	@Override
	public String toString() {
		return "SavingAccount [returnRate=" + returnRate + ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}

	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		super.deposit(money + 100);
		super.withdraw(5);
		
	}

	@Override
	public void withdraw(int money) {

		this.balance = this.balance - money - 10;

	}

}
