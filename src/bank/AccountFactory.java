package bank;

import java.util.Scanner;
public class AccountFactory {
	
 public static Account CreateAccount(String name,String phum,String accnum,double balance) {
	 Account acc= null;
	 System.out.println(" please enter your acc type");
	 Scanner sc = new Scanner(System.in);
	 String acctype = sc.next();
	 
	 if(acctype.equalsIgnoreCase("savings")) {
		 acc = new Savings(name,phum,accnum,balance);
		 
	}else if(acctype.equalsIgnoreCase("current")) {
		acc = new Current(name,phum,accnum,balance);
		
	}else if(acctype.equalsIgnoreCase("credit")) {
		acc = new Credit(name,phum,accnum,balance);
		
	}else {
		System.out.println("invalid acc type");
		
	}
	 return acc;
	 
 }
}

