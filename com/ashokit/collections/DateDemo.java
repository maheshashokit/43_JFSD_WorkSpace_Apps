package com.ashokit.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DateDemo {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println("Current Date::::" + d);

		// we can format the date & time as per your application requirement
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");

		// format is used to format the date by taking date input & return formatted
		// date value
		String formatedDate = sdf.format(d);

		System.out.println("Formatted Date::::" + formatedDate); // 11-July-2023 09:21:38
		
		//SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");
		Date d1 = sdf.parse(formatedDate);

		System.out.println("Date value ::::" + d1);// Default Date Format given by Java
		
		List<String> strings = List.of("Test","Test");
		System.out.println(strings);
		
		
		String[] names = {"Ganesh","Ramesh","Suresh","Mahesh"};
		System.out.println(names);
		for(String eachName : names) {
			System.out.println(eachName);
		}
		System.out.println("Printing data:::" + Arrays.toString(names));
		

		
	}
}
