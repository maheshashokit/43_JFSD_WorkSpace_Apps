package com.ashokit.threads;

public class Consumer1 implements Runnable{
	
	//creating the producer object
	 private Producer prod;
	 
	 //Defining the Constructor
	 public Consumer1(Producer prod) {
		 this.prod = prod;
	 }
	 
	 @Override
	public void run() {
		//Implementing the Consumer Thread Logic
        System.out.println("******************Consumer Thread***********************");
        synchronized (prod.data) {
        	//checking the productionStatus flag is true or not
            try {
    			 prod.data.wait();			
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
		}        
        //Data Production is over and we can retrieve from Information from StringBuffer object
        System.out.println("Producer Data::::::" + prod.data);
	 }
}
