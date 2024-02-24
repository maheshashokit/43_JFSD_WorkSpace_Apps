package com.ashokit.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithMultipleResourcesDemo {
	
	public static void main(String[] args) {
		
		try(
			//Reading data from keyboard
			Scanner sc = new Scanner(System.in);
			//Reading data from file
		     FileInputStream fis = new FileInputStream("src/sample.txt");
	        //Writing data into file
		     FileOutputStream fos = new FileOutputStream("src/sample.txt");
		   ){
			
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
