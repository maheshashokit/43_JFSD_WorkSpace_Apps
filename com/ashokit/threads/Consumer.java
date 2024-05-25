package com.ashokit.threads;

//Consumer class is used to consume the data from producer
public class Consumer implements Runnable {

	// creating the producer object
	private Producer prod;

	// Defining the Constructor
	public Consumer(Producer prod) {
		this.prod = prod;
	}

	@Override
	public void run() {
		// Implementing the Consumer Thread Logic
		System.out.println("******************Consumer Thread***********************");

		// checking the productionStatus flag is true or not
		while (!prod.productionStatus) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Data Production is over and we can retrieve from Information from
		// StringBuffer object
		System.out.println("Producer Data::::::" + prod.data);

		// again setting back the productionstatus flag to false
		prod.productionStatus = false;
	}
}