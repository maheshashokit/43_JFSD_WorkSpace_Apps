package com.ashokit.collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties props = new Properties();

		// adding the data into properties object
		props.setProperty("Username", "Mahesh");
		props.setProperty("Password", "Mahesh");
		props.setProperty("Gender", "Male");
		props.setProperty("Designation", "Software Engineer");
		props.setProperty("Test", "Mahesh Test");
		System.out.println(props);
		// getting the properties
		String propertyValue = props.getProperty("Username1");
		System.out.println("Username Value:::::" + propertyValue);
		String propValue = props.getOrDefault("Username1", "Default Username").toString();
		System.out.println("Username::::" +propValue);
		
		System.out.println();
		Properties dbProps = new Properties();
		//loading the properties file information into properties object
		dbProps.load(new FileReader("src/database.properties"));
		System.out.println(dbProps);
		System.out.println(dbProps.get(ApplicationConstants.DATABASEUSERNAME));
		System.out.println(dbProps.get(ApplicationConstants.DATABASEPASSWORD));
		
		Properties emailProps = new Properties();
		emailProps.load(new FileReader("src/mailServer.properties"));
		System.out.println("Email Properties :::::" + emailProps);
		
	}
}