package com.ashokit.java8;

import java.time.LocalDateTime;

public class DateAndTimeDemo {

	public static void main(String[] args) {
		
		LocalDateTime currDateTime = LocalDateTime.now();
		LocalDateTime dt1 = LocalDateTime.of(2020, 8, 13, 5, 32);
		LocalDateTime dt2 = LocalDateTime.parse("2020-08-13T05:32");
		
		System.out.println(currDateTime);
		System.out.println(dt1);
		System.out.println(dt2);	
	}
}
