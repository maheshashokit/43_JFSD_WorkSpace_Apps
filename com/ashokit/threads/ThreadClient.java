package com.ashokit.threads;

public class ThreadClient {

	public static void main(String[] args) {
		
		//Creating the First Thread to execute Thread logic
		NumberThread nt = new NumberThread();
		nt.setName("Ashok-Thread");
		nt.start();
		
		//Creating the Second Thread to execute Thread logic
		NumberThread nt1 = new NumberThread();
	    nt1.setName("Mahesh-Thread");
		nt1.start();
	}
}
