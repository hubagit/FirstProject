package day40_may7;

public class BankActivity2 {

	public static void main(String[] args) {

		BankAccount2 customer1 = new BankAccount2();

		customer1.accountHolder = "Ahmed";
		customer1.deposit(100000);
		customer1.printInfo();
		customer1.withdraw(7000);
		customer1.printInfo();
		customer1.deposit(200000);
		customer1.printInfo();
		customer1.add100Dollars();
		System.out.println(customer1.balance);

	}

}
