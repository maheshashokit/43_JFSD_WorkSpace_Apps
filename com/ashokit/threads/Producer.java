package com.ashokit.threads;

//Producer class is used for producing the data
public class Producer implements Runnable {

	// Taking variable here for adding the data into StringBuffer object
	public StringBuffer data;

	// Taking flag productionStatus indicates whether production got completed or not
	public boolean productionStatus = false;

	// Defining the Constructor
	public Producer() {
		data = new StringBuffer();
	}

	@Override
	public void run() {
		// Implementing the Producer Thread Logic
		System.out.println("******************Producer Thread***********************");
		for (int i = 1; i <= 20; i++) {
			try {
				data.append(i + " ");
				System.out.println("Data Producing............");
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// change the status for flag
		productionStatus = true;
	}
}