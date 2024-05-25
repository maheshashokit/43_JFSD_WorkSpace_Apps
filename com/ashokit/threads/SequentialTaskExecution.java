package com.ashokit.threads;

public class SequentialTaskExecution {

	public static void main(String[] args) {
		// Create the tasks
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		Task3 task3 = new Task3();

		// Create the threads
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);

		try {
			// Start the first thread
			thread1.start();
			// Wait for the first thread to complete
			thread1.join();

			// Start the second thread
			thread2.start();
			// Wait for the second thread to complete
			thread2.join();

			// Start the third thread
			thread3.start();
			// Wait for the third thread to complete
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}