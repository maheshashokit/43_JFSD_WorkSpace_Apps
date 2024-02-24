package com.ashokit.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class TestException {
	
	public static void main(String[] args)throws FileNotFoundException,SQLException,IOException,ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("src/sample.txt");
		
		
	}
	
	public static void display(String[] names) throws FileNotFoundException,SQLException,IOException,ClassNotFoundException {
		main(names);
	}

}
