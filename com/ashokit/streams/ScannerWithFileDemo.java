package com.ashokit.streams;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerWithFileDemo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new FileReader("stream.txt"));
			 PrintStream pw = new PrintStream(System.out);) {
			// hasNextLine() checks in the file whether we have nextLine or not
			while (sc.hasNextLine()) {
				// sc.nextLine() is used to get the current line from file
				String currentLineInfo = sc.nextLine();
				pw.println(currentLineInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
