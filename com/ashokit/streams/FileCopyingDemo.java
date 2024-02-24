package com.ashokit.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileCopyingDemo {
	
	public static void main(String[] args) {
		//outer try-with-resource
		try(Scanner sc = new Scanner(System.in);){
			
			System.out.println("Enter Source File Name to be copied...");
			String sourceFileName = sc.next();
			System.out.println("Enter Destination File name");
			String destinationFileName = sc.next();

			//Inner try-with-resource
			try(FileInputStream fis = new FileInputStream(sourceFileName);
				FileOutputStream fos = new FileOutputStream(destinationFileName);
			   ){
				//Reading the data from sourcefile
				byte[] readAllBytes = fis.readAllBytes();
				
				//writing the data into destination file
				fos.write(readAllBytes);
				
				System.out.println("File Data Copied From Source File to Destination file.....");
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}