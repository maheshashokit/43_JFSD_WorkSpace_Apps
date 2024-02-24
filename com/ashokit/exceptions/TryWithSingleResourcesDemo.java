package com.ashokit.exceptions;

import java.util.Scanner;

public class TryWithSingleResourcesDemo {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);){
			
			System.out.println("Enter First Value....");
			int firstValue = sc.nextInt();
			System.out.println("Enter Second Value....");
			int secondValue = sc.nextInt();
			
			int sum = firstValue + secondValue;
			System.out.println("Addition of Two Numbers::::::" + sum);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
