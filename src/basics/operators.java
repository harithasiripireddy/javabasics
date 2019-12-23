package basics;

import java.util.Scanner;

public class operators {
	
static Scanner s;

	public void arithmatic() {
		System.out.println("ARITHMATIC OPERATORS");
		// create two local variables
		int a, b, r;
		System.out.println("please enter a and b values");
		a = s.nextInt();
		b = s.nextInt();

		// addition(+)
		r = a + b;
		System.out.println("sum of a and b is " + r);
		// subtraction(-)
		r = a - b;
		System.out.println("subtraction of a and b is " + r);
		// multiplication
		r = a * b;
		System.out.println("muliplication of a and b is " + r);
		// division(/)
		r = a / b;
		System.out.println("division of a and b is " + r);
		// modular division(%)
		r = a % b;
		System.out.println("modular division of a and b is " + r);
	}

// logical//
	 
	public void logical() {
		System.out.println("LOGICAL OPERATORS");
		boolean a, b;
		System.out.println("enter a and b values");
		a = s.nextBoolean();//true
		b = s.nextBoolean();//false
		// && (AND)
		System.out.println("a AND b is: " + (a && b));//true
		// ||(OR)
		System.out.println("a OR b is: " + (a || b));//false
		// ! (NOT)
		System.out.println("NOT A is: " + (!a));
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		operators obj = new operators();
		obj.arithmatic();
		obj.logical();
	}
}