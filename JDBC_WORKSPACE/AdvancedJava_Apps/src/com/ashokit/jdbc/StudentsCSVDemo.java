package com.ashokit.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;

public class StudentsCSVDemo {

	public static void main(String[] args)throws Exception {
		
		//locating the file
		FileReader fr = new FileReader("src\\students.csv");
		
		//Connecting to BufferedReader
		BufferedReader br = new BufferedReader(fr);
		
		//Reading the first line of student
		String currentLine = br.readLine();
		
		//processing the currentLine
		while(currentLine != null) {
			
			//displaying the currentLine
			System.out.println(currentLine);
			
			//spliting the currentline by comma seperated
			String[] spiltedValues = currentLine.split(",");
			System.out.println(spiltedValues[0]+"---"+ spiltedValues[1]+"---"+spiltedValues[2]);
			
			//updating the next subsequent lines
			currentLine = br.readLine();
		}
	}
}
