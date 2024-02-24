package com.ashokit.exceptions;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Started ::: Exception Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value");
		int a = sc.nextInt();
		System.out.println("Enter Second Value");
		int b = sc.nextInt();
		//performing the division operation
		int c = 0;
		try {
			//Risky statement
			c = a/b;
			System.out.println("Testing");
		}catch(ArithmeticException ae) {
			System.out.println("Exception Caught due to Division Error.....");
		}
		System.out.println("Division Value:::::" + c);
		System.out.println("Ended ::: Exception Program");
		
	}
}