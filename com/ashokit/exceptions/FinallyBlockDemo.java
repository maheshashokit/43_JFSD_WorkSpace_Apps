package com.ashokit.exceptions;

import java.util.Objects;
import java.util.Scanner;

public class FinallyBlockDemo {
	
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter First Value.....");
			int a = sc.nextInt();
			System.out.println("Enter Second Value.....");
			int b = sc.nextInt();
			System.out.println("First   Value :::" + a);
			System.out.println("Second  Value :::" + b);
			
		}catch(Exception e) {
			System.out.println("Exception Raised During the Scanner Object Creation...");
			e.printStackTrace();
		}finally {
			System.out.println("Compulsory Executed Block....");
		   if(Objects.nonNull(sc)) sc.close();
		}
		
		
	}

}
