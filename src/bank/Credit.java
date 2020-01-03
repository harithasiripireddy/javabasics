package bank;

public class Credit extends BaseAccount {
	private double creditlimit;
	private double cashlimit;
	public Credit(String name,String phum,String accnum,double balance ) {
		super(name,phum,accnum,balance);
		
		creditlimit=balance;//bal is creditlimit
		cashlimit= balance*0.3;
		
	}
	// deposit(repayments)
	//@override
     
public void deposit(double amount) {
	if( amount >= 0) {
		if(amount <=(creditlimit- balance)) {
			System.out.println("amount depositing");
			this.balance=balance+amount;
			 this.cashlimit = balance*0.3;
			System.out.println("depositing successfully");
		}else {
			System.out.println("total due amountis" +(creditlimit-balance)+"amount your entered is"+amount);
		}
		
	}else {
		System.out.println("invalid amount");
	}
  }

                   //@overridewithdraw
    public double withdraw(double amount) {
    	if(amount>=0) {
    		if (validate()) {
    			if(this.cashlimit>=amount) {
    				System.out.println("withdrawing...");
    				this.balance=balance-amount;
    				System.out.println("please collect your cash");
    				this.balance=balance-500;
    				this.cashlimit=balance*0.3;
    				return amount;
    			}else {
    				System.out.println("insufficient bal");
    				
    			}
    		}
    			
    		}else {
    			System.out.println("invalid amount");
    			
    		}
    		return 0;
    	  }
    
       }






































