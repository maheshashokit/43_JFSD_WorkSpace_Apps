package com.ashokit.streams;

import java.io.FileInputStream;

public class FileReadingDemoVersion2 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("demo.txt");){
			
			System.out.println("Available Bytest::::" + fis.available());
			//Reading all the bytes in single go
			byte[] readAllBytes = fis.readAllBytes();
			String fileContent = new String(readAllBytes);
			System.out.println(fileContent);
			System.out.println("Data Reading Successfully....");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}