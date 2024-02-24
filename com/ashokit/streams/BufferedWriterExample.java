package com.ashokit.streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
	public static void main(String[] args) {
		try {
			// Create a FileWriter and wrap it with a BufferedWriter
			FileWriter fileWriter = new FileWriter("output.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			// Write some text
			bufferedWriter.write("Hello, world!");
			bufferedWriter.newLine(); // Write a new line

			// Close the buffered writer
			bufferedWriter.close();

			System.out.println("Data written successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}