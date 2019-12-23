package basics;
import java.util.Scanner;
import java.util.Scanner;

public class operators2 {
static Scanner s ;
 public void relational() {
	 System.out.println("Relational operators");
	 
	 int a,b,values;
	 System.out.println("enter a , b  value");
	 a=s.nextInt();
	 b=s.nextInt();
	 
	//== 
	 System.out.println("a == b is" +(a==b));
	 //!=
	 System.out.println("a != b is" + (a!= b));
	 //>
	 System.out.println("a > b is" + (a > b));
	 //<
	 System.out.println(" a < b is" + (a < b) );
 }
	 // Assignment operators
 public void assignment() {
	 System.out.println(" assignment operators");
	 int a,b  ;
	 System.out.println("enter a value");
	 a = s.nextInt();
	
	
	
	 
	// =
			b = a;
	 System.out.println(" b value is " + b);
		// += > a += b > a = a+b
		b += a;
		System.out.println("b value is " + b);
		// -= > a -= b > a = a-b
		b -= a;
		System.out.println("b value is " + b);
		// *= > a *= b > a = a*b
		b *= a;
		System.out.println("b value is " + b);
		// /= > a /= b > a = a/b
		b /= a;
		System.out.println("b value is " + b);
		// %= > a %= b > a = a%b
		b %= a;
		System.out.println("b value is " + b);
		/*
		 * post increment: a = b++ > a = b and b = b+1 assign right operand value to the
		 * left operand then increase right operand value by 1
		 */
		b = a++;
		System.out.println("a : " + a + "\tb : " + b);
		/*
		 * pre increment: a = ++b > b = b+1 and a = b increase right operand value by
		 * 1 and assign that value to left operand
		 */
		b = ++a;
		System.out.println("a : " + a + "\tb : " + b);
		/*
		 * post decrement: a = b-- > a = b and b = b-1 assign right operand value to the
		 * left operand then decrease right operand value by 1
		 */
		b = a--;
		System.out.println("a : " + a + "\tb : " + b);
		/*
		 * pre decrement: a = --b > b = b-1 and a = b decrease right operand value by
		 * 1 and assign that value to left operand
		 */
		b = --a;
		System.out.println("a : " + a + "\tb : " + b);

	}
	 
	 
		 
 
 

	public static void main(String[] args) {
   s = new Scanner(System.in);
   operators2 m = new operators2();
   m.relational();
   m.assignment();
   

	}

}
