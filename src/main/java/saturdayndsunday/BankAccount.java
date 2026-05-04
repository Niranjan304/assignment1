package saturdayndsunday;

public class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private String accountType;

	public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType) {

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		if (balance >= 1000) {
			this.balance = balance;
		}

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountNumber(String accountNumber) {
		if (accountNumber == null) {
			System.out.println("Entre a valid Number");
		} else {
			this.accountNumber = accountNumber;
		}
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountType(String accountType) {

		if ((accountType == "Current") || (accountType == "Savings")) {
			this.accountType = accountType;
		} else {
			System.out.println("Entre a valid accountType");
		}
	}

	public boolean deposit(double amount) {
		if ((amount > 0) && (amount < 50000)) {
			this.balance += balance;
			return true;
		} else {
			System.out.println("Entre balane according to the paramenters");
			return false;
		}
	}

	public boolean withdraw(double amount) {
		if ((amount > 0) && (this.balance - amount > 1000)) {
			System.out.println("Withdrawing " + amount);
			this.balance = balance - amount;
			System.out.println("Withdrawal successful! New Balance: " + balance);
			return true;
		} else {
			System.out.println("Attempting to withdraw " + amount);
			System.out.println("Insufficient balance! Minimum ₹1000 must be maintained.");
			return false;
		}
	}

	public void displayAccountInfo() {
		System.out.println("Account number : " + accountNumber);
		System.out.println("HolderName : " + accountHolderName);
		System.out.println("Account Type : " + accountType);
		System.out.println("Balance : " + balance);
		System.out.println("------------");
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("ICICI123498765", "Kumar", 23456, "Savings");
		acc.displayAccountInfo();
		acc.deposit(15000);
		acc.withdraw(14000);
		System.out.println("Details after Transactions");
		acc.displayAccountInfo();
	}
}
