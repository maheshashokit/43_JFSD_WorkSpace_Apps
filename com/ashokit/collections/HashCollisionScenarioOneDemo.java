package com.ashokit.collections;

import java.util.HashMap;

public class HashCollisionScenarioOneDemo {

	public static void main(String[] args) {
		HashMap<String, String> javaTrainers = new HashMap<>();
		// adding the data to map object
		javaTrainers.put("Mahesh", "JFSD");
		javaTrainers.put("Ashok", "SpringBoot");
		javaTrainers.put("Suresh", "WebDevelopment");
		javaTrainers.put("Ramesh", "PHP");
		javaTrainers.put("Mahesh", "Mahesh@123");
		System.out.println("JavaTrainers:::::" + javaTrainers);

	}
}
