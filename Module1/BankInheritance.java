package Module1;
// Parent class: BankAccount
class BankAccount {
	String accountNumber;
	double balance;

	// Constructor
	BankAccount(String accNumber, double bal) {
		this.accountNumber = accNumber;
		this.balance = bal;
	}

	// Method to deposit money
	void deposit(double amount) 
	{
		balance += amount;//balance = balance + amount;
		System.out.println("Deposited: " + amount + ". New Balance: " + balance);
	}

	// Method to withdraw money
	void withdraw(double amount) {
		if (balance >= amount)
		{
			balance -= amount;
			System.out.println("Withdrawn: " + amount + ". Remaining Balance: " + balance);
		} else {
			System.out.println("Insufficient balance!");
		}
	}
}

// Child class: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {
	double interestRate;

	// Constructor
	SavingsAccount(String accNumber, double bal, double rate) {
		super(accNumber, bal); // Calling parent class constructor
		this.interestRate = rate;
	}

	// Method to add interest
	void addInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;
		System.out.println("Interest Added: " + interest + ". New Balance: " + balance);
	}
}

// Child class: CurrentAccount (inherits from BankAccount)
class CurrentAccount extends BankAccount 
{
	double overdraftLimit;

	// Constructor
	CurrentAccount(String accNumber, double bal, double overdraft) {
		super(accNumber, bal);
		this.overdraftLimit = overdraft;
	}

	// Overriding withdraw method to allow overdraft
	@Override
	void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) 
		{
			balance -= amount;
			System.out.println("Withdrawn: " + amount + ". Remaining Balance: " + balance);
		} else {
			System.out.println("Overdraft limit exceeded!");
		}
	}
}

public class BankInheritance 
{
	public static void main(String[] args) 
	{
		SavingsAccount mySavings = new SavingsAccount("SA12345", 5000, 5);
		mySavings.deposit(1000);
		mySavings.addInterest();
		mySavings.withdraw(2000);

		System.out.println("-----------------");

		CurrentAccount myCurrent = new CurrentAccount("CA67890", 3000, 2000);
		myCurrent.deposit(500);
		myCurrent.withdraw(4000); // Uses overdraft
		myCurrent.withdraw(2000); // Overdraft exceeded
	}
}
