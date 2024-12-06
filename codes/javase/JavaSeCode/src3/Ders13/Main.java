package Ders13;

public class Main {

	public static void main(String[] args) {
		BankAccount savingAccount = new SavingAccount(1000.0); 
        BankAccount currentAccount = new CurrentAccount(3000.0);

        System.out.println("Yoxlanir SavingAccount:");
        savingAccount.deposit(700.0);
        savingAccount.withdraw(400.0); 
        savingAccount.withdraw(100.0);

        System.out.println("yoxlanir CurrentAccount:");
        currentAccount.deposit(1200.0);
        currentAccount.withdraw(1200.0);
	}

}
