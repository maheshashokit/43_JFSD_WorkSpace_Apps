package com.ashokit.threads;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Welcome To Ashok IT......");
		
		Thread threadDetails = Thread.currentThread();
		System.out.println(threadDetails);
		threadDetails.setName("Mahesh");
		System.out.println(threadDetails);
		ThreadGroup threadGroupDetails = threadDetails.getThreadGroup();
		System.out.println(threadGroupDetails.getName());
	}
}