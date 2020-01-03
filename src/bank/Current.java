package bank;

public class Current extends BaseAccount {
	private static final double minbalance = 25000;
	public Current(String name,String phum,String accnum,double balance) {
	      super(name,phum,accnum,balance);
	}

  public double withdraw(double amount) {
	  if (amount>=0) {
		  if(validate()) {
			  System.out.println("withdrawing money");
			  this.balance=balance-amount;
			  System.out.println("please collect your cash");
			  if(this.balance<minbalance) {
				  this.balance=balance-500;
				  
			}
			  return amount;
		  }else {
			  System.out.println("insufficient balance");
			  
		  }
	  }else {
		  System.out.println("invalid amount");
	  }
	  return 0;
  }

}
