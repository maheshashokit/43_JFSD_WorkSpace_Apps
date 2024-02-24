package com.ashokit.exceptions;

public class IndexOutOfBoundsExceptions {
	
	public static void main(String[] args) {
		
		System.out.println("Program Started.....");
		
		int arr[]= {10,20,30,40,50};
		
		double divisionValue = 0;
		//First Version
		/*try {
			
			divisionValue = arr[3] / arr[40]; // 40/50,40/0
	
		}catch(ArithmeticException ae) {
			System.out.println("Exception Occured During Division operation.....");
		}catch(ArrayIndexOutOfBoundsException ae1) {
			System.out.println("Sorry Your Index of Array is not Found......");
		}*/
		
		//Second version
		try {
			
			divisionValue = arr[3] / arr[40]; // 40/50,40/0
	
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println("Exception Occured During operation....." + ae.getMessage());
			ae.printStackTrace();
		}
		System.out.println("Division value ::::" + divisionValue);
		
		System.out.println("Program Endced.....");
	}
}
