package bank;
import java.util.Scanner;
public class BaseAccount implements Account {
	
	private String name;
	private String phum;
	private String accnum;
	protected double balance;
	private int pin;
	 
	 public BaseAccount( String name,String phum,String accnum,double balance) {
		 this.name=name;
		 this.phum= phum;
		 this.accnum=accnum;
		 this.balance= balance;
		 
		 }

	public String getPhum() {
		return phum;
	}

	public void setPhum(String phum) {
		this.phum = phum;
	}

	public String getName() {
		return name;
	}

	public String getAccnum() {
		return accnum;
	}
      public void displayBalance() {
    	  System.out.println( "balance in your account is" + this.balance);
      }
      
                 //@override
	public void setPin() {
		Scanner sc = new Scanner(System.in);
		if(this.pin==0) {
			System.out.println(" please enter your pin");
			int pin= sc.nextInt();
			this.pin=pin;
		}
		else {
			System.out.println("update  your pin please enter your phone num starts with "+this.phum.substring(0,3) );
			
			String phum= sc.next();
			if ( this.phum==phum) {
				System.out.println(" your pin num is" + this.pin);
				
			}else {
				System.out.println( "inavalid phum num");
				}
			}
         }

                 // @ override
	     public boolean validate() {
	    	 if(this.pin!=0) {
	    		 Scanner sc = new Scanner (System.in);
	    		 System.out.println(" enter your pin"); 
	    		 int pin= sc.nextInt();
	    		 if(this.pin==pin) {
	    			 return true;
	    	 }else {
	    		 System.out.println("invalid pin");
	    	 }
	     }else {
	    	 System.out.println( "please  set pin first");
	     }
	    	return false;
	    }

               // @override deposit
	     public void deposit( double amount) {
	    	 if (amount >= 0) {
	    		 System.out.println( "depositing");
	    		 this.balance=balance+amount;
	    		 System.out.println(" depositing successfull");
	    	 }else {
	    		 System.out.println("incorrect amount");
	    		 }
	     }

                 // @override withdraw
	     public double withdraw(double amount) {
	    	 if(validate()) {
	    		 System.out.println("please enter your amount");
	    		 if(this.balance>=amount) {
	    			 this.balance=balance-amount;
	    			 System.out.println("please collect your cash");
	    			 return amount;
	    			 }
	    		 else {
	    			 System.out.println(" insufficient bal");
	    	 }
	     }else {
	    	 System.out.println("inavalid amount");
	    	}
	    	 return 0;
	     }
	     
	   }