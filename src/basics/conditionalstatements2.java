package basics;
import java . util.Scanner;
public class conditionalstatements2 {
	

	public static void main(String[] args) {
		// if condition
    int i=-4;
   //{
  //  	System.out.println(" given num is negitive.");
   // }
        // if else condition
    //if(i<0) {
    	System.out.println(" given condition is negive.");
   // }
  //	else {
  	//	System.out.println("given  condition  is postive.");
  		
  	 // }
              // nested if
    Scanner sc = new Scanner(System.in);
    double n1=4.5, n2=5.8,n3=6.8;
   
    
    if(n1>n2) {
    	
    	if(n3>n2) {
    		System.out.println("largest num n3 ");
    	}else {
    		
    		System.out.println("largest num n2");
    	}}else {
    		System.out.println("invalid num");
    	}
    	// else if ladder
    
	
    System.out.println("enter the score you got");
    int Scanner = sc.nextInt();
	int Score = 500;  
	if(Score <= 500) {
		System.out.println("Keep Playing......");
	}else if(Score <= 1000) {
		System.out.println("bronze medal");
	}else if(Score <= 1500) {
		System.out.println("silver medal");
	}else {	
		System.out.println("gold medal");
	}
	
	
	// else if lader program
	int  j  = -15;
	if(j< 0) {
		System.out.println(" given number is negitive");
	}else if(j>0) {
	  System.out.println(" given number is postive");
	}else
		System.out.println(" given number is invalid");
			
	}
	
	
	
	
	
	
	
	
	
	
	
	}
    	
  
    
  
    
	
	
	
	
	
	
	
	
	
	
	
	

	
