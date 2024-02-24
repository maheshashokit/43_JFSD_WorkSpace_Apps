package com.ashokit.streams;

import java.io.FileInputStream;

public class FileReadingDemo {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("demo.txt");){
			
			//Started Reading the Data from File
			int data;
			while((data = fis.read()) != -1) {
				//System.out.println("Data value:::" + data);
				System.out.print((char)data);
			}
			System.out.println("Data Reading Successfully....");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}