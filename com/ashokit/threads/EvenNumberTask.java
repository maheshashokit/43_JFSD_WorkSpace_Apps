package com.ashokit.threads;

public class EvenNumberTask implements Runnable {

	 @Override
	public void run() {
		 System.out.println("Even Numbers Thread Name:::" + Thread.currentThread().getName());
		 for(int i =1; i<=20; i++) {
			 if(i % 2 == 0) {
				 System.out.println("Even Number Task i =" + i);
			 }
		 }
	}
}
