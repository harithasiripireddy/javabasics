package bank;

public interface Account {
	void deposit(double amount);
	
	double withdraw(double amount);
	
	String getName();
	
	String getAccnum();
	
	void setPin();
	
	boolean validate();
	
	void setPhum(String phum);
	
	String getPhum();
	
	void displayBalance();

}
