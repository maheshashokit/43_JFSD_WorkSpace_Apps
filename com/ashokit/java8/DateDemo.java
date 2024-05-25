package com.ashokit.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDemo {

	public static void main(String[] args) {
		
		LocalDate currDate = LocalDate.now();
		System.out.println("Current Date is: " + currDate);
		
		LocalDate date = LocalDate.of(2021, 8, 13);
		System.out.println("Date: " + date);
		
		LocalDate date1 = LocalDate.parse("2021-08-13");
		System.out.println("Date-1: " + date1);
		
		
		LocalDate yesterday = currDate.minusDays(1);////2023-08-03
		LocalDate tomorrow = currDate.plusDays(1);//2023-08-05
		
		System.out.println("Current Date: " + currDate);
		System.out.println("tomorrow's Date: " + tomorrow);
		System.out.println("Yesterday's Date: " + yesterday);
		
		LocalDate nextYearDate = currDate.plusYears(1);
		LocalDate lastYearDate = currDate.minusYears(1);
		System.out.println("Next Year Date::::" + nextYearDate);
		System.out.println("Last Year Date::::"+ lastYearDate);
		
		
		LocalDate date11 = currDate.plus(5, ChronoUnit.MONTHS);
		LocalDate date22 = currDate.minus(5, ChronoUnit.DAYS);		
		
		System.out.println("Current Date: " + currDate);
		System.out.println("Current Date plus five months: " + date11);
		System.out.println("Current Date minus five days: " + date22);
		
		DayOfWeek dayOfWeek = currDate.getDayOfWeek();//getDayOfWeek() returns a DayOfWeek instance and not a String
		int dayOfMonth = currDate.getDayOfMonth();
		int dayOfYear = currDate.getDayOfYear();
		
		System.out.println("Date: " + currDate);
		System.out.println("Day of Week: " + dayOfWeek);
		System.out.println("Day of Month: " + dayOfMonth);
		System.out.println("Day of Year: " + dayOfYear);
		
		LocalDate tomorrow1 = currDate.plusDays(1);
		LocalDate yesterday1 = currDate.minusDays(1);
		
		System.out.println("Current date is after yesterday's date: " + currDate.isAfter(yesterday1));
		System.out.println("Current date is before tomorrow's date: " + currDate.isBefore(tomorrow1));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		String formattedDateValue = currDate.format(dtf); //05-April-2024
		System.out.println("Formatted Date:::::" + formattedDateValue);
	}
}
