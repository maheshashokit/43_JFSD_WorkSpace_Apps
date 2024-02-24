package com.ashokit.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class BufferedReaderDemo {
	
	public static void main(String[] args) {
		
		String studentInformation;
		try(BufferedReader br = new BufferedReader(new FileReader("students.txt"))){
			
			while((studentInformation = br.readLine()) != null) {
				System.out.println("111111111111");
				System.out.println(studentInformation);
				String[] splitedValues = studentInformation.split(",");
				System.out.println(Arrays.toString(splitedValues));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
