package com.ashokit.exceptions;

//Userdefined Exception class
public class CustomerNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException() {
		//calling the super class constructor
		super();
	}
	
	public CustomerNotFoundException(String errorMessage,String customerId) {
		//calling the super class constructor
		super(String.format(errorMessage, customerId));
	}

}