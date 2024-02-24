package com.ashokit.streams;

import java.io.FileOutputStream;

public class FileCreationDemo {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("demo.txt",true);) {
		
			System.out.println("File Created in location");
			
			String welcomeMessage ="Welcome To AshokIT Hyderabad Ameerpet \n";
			
			//writing the data into file
			fos.write(welcomeMessage.getBytes());
			fos.write(97);
			
			fos.flush();
			
			System.out.println("Completed Writing data to the file....");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}