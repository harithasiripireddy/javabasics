package bank;

public class TestAccount {

	public static void main(String[] args) {
		Account acc = AccountFactory.CreateAccount("haritha","9398355801","sbin0004",100000);
		acc.setPin();
		acc.deposit(20000);
		acc.displayBalance();
		acc.withdraw(15000);
		acc.displayBalance();
		acc.deposit(10000);
		acc.displayBalance();
		
	}	

	}

