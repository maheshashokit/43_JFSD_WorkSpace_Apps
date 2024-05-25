package com.ashokit.threads;

//Producer class is used for producing the data
public class Producer1 implements Runnable {
	
	//Taking variable here for adding the data into StringBuffer object
	public StringBuffer data;
	
	//Taking flag productionStatus indicates whether production got completed or not
	public boolean productionStatus = false;
	
	//Defining the Constructor 
	public Producer1() {
		data = new StringBuffer();
	}
	
	@Override
	public void run() {
		//Implementing the Producer Thread Logic
		System.out.println("******************Producer Thread***********************");
		synchronized (data) {
			for(int i = 1 ; i<=20; i++) {
				try {
					data.append(i + " ");
					System.out.println("Data Producing............");
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//sending signal mydata production is completed.....
			data.notify();
		 } 
      }	
}