package com.bluescope;

 
public class Exception_handling {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println("Inside the try block");
			int result=a/b;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException a1){
			System.out.println("Exception caught: divide by 0 ");
		}
		finally {
			System.out.println("this block always Execute");
		}
			System.out.println("This program execute normally");
		}
 	}


