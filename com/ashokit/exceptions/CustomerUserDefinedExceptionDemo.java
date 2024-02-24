package com.ashokit.exceptions;

import java.util.Scanner;

public class CustomerUserDefinedExceptionDemo {
	
    public static void main(String[] args) {
    	
    	//Creating some Customers
    	Customer cust1 = new Customer("AIT123","Mahesh");
    	Customer cust2 = new Customer("AIT111","Suresh");
    	Customer cust3 = new Customer("AIT222","Rajesh");
    	Customer cust4 = new Customer("AIT333","Nagesh");
    	Customer cust5 = new Customer("AIT444","Naresh");
    	
        //Creating the customer[]
    	Customer[] allCustomers = {cust1,cust2,cust3,cust4,cust5};
    	
    	//creating the scanner class object
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter CustomerID to be Search....");
    	String searchCustomerId = sc.next();// AIT123 (or) ait123
    	
    	//processing the customer[]
    	boolean searchFlag = false;
    	for(Customer cust : allCustomers) {
    		if(searchCustomerId.equalsIgnoreCase(cust.getCustomerId())) {
    			System.out.println(cust.getCustomerId() + "====" + cust.getName());
    			searchFlag = true;
    			break;
    		}
    	}
    	
    	//checking the flag
    	if(searchFlag) {
    		System.out.println("Customer Is Found");
    	}else {
    		throw new CustomerNotFoundException("Given CustomerId is Not found %s", searchCustomerId);
    	}
	}
}
