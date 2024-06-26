package com.ashokit.java8;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {
	public static void main(String[] args) {

		// Creating a duration of 2 hours, 30 minutes, and 45 seconds
		Duration duration = Duration.ofHours(2).plusMinutes(30).plusSeconds(45);

		// Accessing the individual components of the duration
		long hours = duration.toHours();
		long minutes = duration.toMinutes() % 60;
		long seconds = duration.getSeconds() % 60;

		// Printing the duration
		System.out.println("Duration: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

		// Adding 1 hour to the duration
		Duration updatedDuration = duration.plusHours(1);

		// Printing the updated duration
		System.out.println("Updated Duration: " + updatedDuration.toHours() + " hours, "
				+ updatedDuration.toMinutes() % 60 + " minutes, " + updatedDuration.getSeconds() % 60
				+ "                                    seconds");
		
		Duration durObj = Duration.between(LocalTime.now(), LocalTime.now().plusHours(10).plusMinutes(12).plusSeconds(55));
		long hours1 = durObj.toHours();
		long minutes1 = durObj.toMinutes() % 60;
		long seconds1= durObj.getSeconds() % 60;
		// Printing the duration
		System.out.println("Duration: " + hours1 + " hours, " + minutes1 + " minutes, " + seconds1 + " seconds");

	}

}
