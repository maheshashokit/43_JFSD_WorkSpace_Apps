package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		List<String> nonTechnicalStaff = new ArrayList<String>();
		nonTechnicalStaff.add("Sarath");
		nonTechnicalStaff.add("Raju");
		nonTechnicalStaff.add("Vijay");
		nonTechnicalStaff.add("Prakash");
		System.out.println("Non Technical Staff::::: " + nonTechnicalStaff);

		// Creating the Set Object with String elements
		Set<String> javaTrainers = new LinkedHashSet<>();
		javaTrainers.add("Suresh");
		javaTrainers.add("Ramesh");
		javaTrainers.add("Nagesh");
		javaTrainers.add("Mahesh");
		javaTrainers.add("Naresh");
		javaTrainers.add("Ashok");
		javaTrainers.add("Ashok");
		javaTrainers.add("Ashok");
		javaTrainers.add("karthik");
		javaTrainers.add("karthik");
		javaTrainers.add("karthik");
		javaTrainers.add("Chanti");
		javaTrainers.add(null);
		System.out.println("Java Trainers in Ashok IT::::" + javaTrainers);

		Set<String> ashokItDetails = new LinkedHashSet<>();
		ashokItDetails.addAll(javaTrainers);
		ashokItDetails.addAll(nonTechnicalStaff);
		System.out.println("Ashok IT Information ::::::" + ashokItDetails);

		// processing the set using Iterator
		Iterator<String> it = ashokItDetails.iterator();

		while (it.hasNext()) {
			System.out.println("Current Element:::::" + it.next());
		}

		System.out.println();
		System.out.println("***************************************************************");

		// processing the set of elements using Java8 version
		Stream<String> allInfos = ashokItDetails.stream();

		Consumer<String> cons = str -> System.out.println("Current Element::::::" + str);
		allInfos.forEach(cons);
	}

}
