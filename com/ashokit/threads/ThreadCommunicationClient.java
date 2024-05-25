package com.ashokit.threads;

public class ThreadCommunicationClient {

	public static void main(String[] args) {

		// creating the Producer Object
		Producer prod = new Producer();

		// creating the Consumer Object
		Consumer cons = new Consumer(prod);

		// creating the thread for executing producer task
		Thread t = new Thread(prod);
		t.setName("Producer");

		// Creating the thread for executing Consumer task
		Thread t1 = new Thread(cons);
		t1.setName("consumer");

		// start the executing the Threads
		t.start();
		t1.start();
	}
}