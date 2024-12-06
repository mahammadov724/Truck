package Ders13;

public class SavingAccount extends BankAccount {
	private double balance;
	
	public SavingAccount(double initialBalance) {
        this.balance = initialBalance;
    }
	
	@Override
    void deposit(double amount) {
        balance += amount; 
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
	
	@Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Balansınızda kifayət qədər vəsait yoxdur...");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
    }
}
