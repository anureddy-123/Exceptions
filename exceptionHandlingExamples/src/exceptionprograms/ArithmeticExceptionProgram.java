package exceptionprograms;

import java.util.Scanner;

public class ArithmeticExceptionProgram {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the first value");
         int a = scn.nextInt();
         System.out.println("enter the second value");
         int b = scn.nextInt();
	    
		// System.out.println(a/b);// dangerous statement so put it inside try catch block
		try{
			
			System.out.println(a/b);
			
		}
		catch(ArithmeticException ae) {
			System.out.println("divide with zero gives exception so reenter the correct value");
			b = scn.nextInt();
			System.out.println(a/b);
			
		}
		finally {
			System.out.println("execution starts");
		}
		
	}

}
