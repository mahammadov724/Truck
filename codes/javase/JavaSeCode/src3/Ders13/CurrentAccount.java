package Ders13;

public class CurrentAccount extends BankAccount {
	    private double balance;

	    public CurrentAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    @Override
	    void deposit(double amount) {
	        balance += amount;  
	        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	    }
	    
	    @Override
	    void withdraw(double amount) {
	        balance -= amount; 
	        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
	    }
	}

}
