package com.bluescope;

import java.util.Scanner;

public class Function {
	public static void main(String[] args) {
		System.out.println("Enter a number to find amstrong or not");
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		if(Amstrong(num)) {
			System.out.println("Amstrong Number");
			
		}
		else {
			System.out.println("Not a Amstrong");
		}}private static boolean Amstrong(int num) {
		int temp=num;
		int temp2=num;
		int count=0;
		int ams=0;
		while(temp!=0) {
			count++;
			temp/=10;
			
		}
		while(temp2!=0) {
			int digit=temp2%10;
			 ams+=(int) Math.pow(digit, count);
			temp2/=10;
			
			
		}
		
		
  		return num==ams;
	}
 
}
