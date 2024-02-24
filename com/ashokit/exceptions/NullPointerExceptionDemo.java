package com.ashokit.exceptions;

import java.util.Objects;

public class NullPointerExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Program Started......");
		Employee emp  = new Employee();
		
		try {
			emp.displayData();
		} catch (NullPointerException npe) {
			// TODO Auto-generated catch block
			npe.printStackTrace();
		}
		
		if(Objects.nonNull(emp)) {
			emp.displayData();
		}else {
			System.out.println("Employee Object is null...");
		}
		System.out.println("Program Ended......");
	}
}
