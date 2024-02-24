package com.ashokit.exceptions;

public class Customer {
	
	public String customerId;
	
	public String name;
	
	public Customer(String customerId,String name) {
		this.customerId = customerId;
		this.name = name;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
