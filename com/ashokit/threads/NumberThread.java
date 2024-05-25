package com.ashokit.threads;

public class NumberThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 1 ; i<=50 ; i++) {
			System.out.println("Current Thread Name ::::" + Thread.currentThread().getName());
			System.out.println("i = " + i);
		}
	}
}
