package basics;
import java.util.Scanner;
public class conditionalstatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// simple if
		// verify given num is postive
		float f=7.5f;
		if(f>=0);{
		System.out.println(" given number is postive");
		
		
		}
		//  if else program
    if(f%2==1){
    	System.out.println("given number is primenumber");
    }
    else 
    {
    	System.out.println(" given number is not a prime number");
    }	
    	         // nested if
    	
    	// gmail check//username
//    	System.out.println(" eneter gmail username");
//    	String username = sc.next();
//    	// password
//    	System.out.println(" enter gmail password");
//    	String password = sc.next();
//    	// comparingi
//    	if(username.equalsIgnoreCase("haritha")&&password.equals("Vihana")){
//    		//condition is true
//    		System.out.println("welcome");
//    	
//    	}else {  
//    		System.out.println(" invalid credentionals");
//    		}
//    		
    	// Else if ladder
    	System.out.println(" enter browser name you want to open");
    	String browsername = sc.next();
    	if (browsername.equalsIgnoreCase("haritha")) {
    		System.out.println("open haritha browser");
    	}else if (browsername.equalsIgnoreCase("vihana")) {
    		System.out.println("open vihana browser");
    	}else if (browsername.equalsIgnoreCase("sekhar")) {
    		System.out.println("open sekhar browser");
    	} else {
    		System.out.println("open internet Explorer");
    	}
    	   // switch case
        switch(browsername.toLowerCase()){
         case "haritha":
        System.out.println("launching haritha browser");
         break;
         case "vihana":
        	 System.out.println(" launching vihana browser");
         break;
         default:
        	 System.out.println(" enter internet explorer");
        	 
        	 
        }
    		
    		
	}
}
	
	


