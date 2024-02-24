package com.ashokit.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		
		//Creating the FileWriter Object
		try(FileWriter fw = new FileWriter("src/mahesh.txt")){
			
			String message = "Welcome To Ashok IT Hyderabad For Corporate Training!!!!!!";
			
			//writing data into file writer 
			fw.write(message);
			fw.write(97);
			
			//calling the flush method
			fw.flush();
			
			System.out.println("File Data Got Written!!!!!");
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}

}
