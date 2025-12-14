package com.bluescope;

import java.util.Scanner;

public class Conditional_Statement {
	public static void main(String[] args) {
    System.out.println("Enter a number to find suitabble place for temperature");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	if(n<20) {
		System.out.println("It is cold");
	}
	else if(n>=20 && n<=30) {
		System.out.println("It is modorate");
	}
	else {
		System.out.println("it is very hot");
	}
	}
	

}
