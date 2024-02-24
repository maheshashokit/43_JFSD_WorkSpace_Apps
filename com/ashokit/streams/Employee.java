package com.ashokit.streams;

import java.io.Serializable;

//Now we are getting capability to transfer the object over network
public class Employee implements Serializable{
	
	private static final long serialVersionUID =12323232L;

	private String id;
	
	private String name;
	
	private transient String designation;

	public Employee(String id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	public void display() {
		System.out.println("Employee ID          ::::" +id);
		System.out.println("Employee Name        ::::" +name);
		System.out.println("Employee Designation ::::" +designation);
	}
}
