package com.ashokit.java8;

import java.time.LocalTime;

public class TimeDemo {

	public static void main(String[] args) {
		LocalTime currTime = LocalTime.now();
		LocalTime t1 = LocalTime.of(5, 32, 44);
		LocalTime t2 = LocalTime.parse("05:32:44");

		System.out.println(currTime);
		System.out.println(t1);
		System.out.println(t2);
	}

}
