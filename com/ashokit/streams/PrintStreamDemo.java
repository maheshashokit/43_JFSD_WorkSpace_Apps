package com.ashokit.streams;

import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {

		try (PrintStream ps = new PrintStream("stream.txt");) {
			String data = "Welcome To Ashok IT PrintStream Class...";
			ps.write(data.getBytes());
			ps.println(false);
			ps.println('a');
			ps.println("Mahesh");
			ps.println(213);
			ps.println(12.3658f);
			ps.println(data);
			System.out.println("Data Written Completed.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}