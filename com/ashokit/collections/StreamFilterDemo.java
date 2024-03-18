package com.ashokit.collections;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilterDemo {

	public static void main(String[] args) {

		// creating the collection for holding the data
		List<String> names = List.of("Suresh", "Mahesh", "Rajesh", "Anil", "Balu");

		// 1.Traditional Approach we can do any approach
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String currentName = iterator.next();
			if (currentName.length() <= 4) {
				System.out.println("Employee Name::::" + currentName);
			}
		}
		
		System.out.println("*****************************************************");
		//2.FullFilling the task using Java8 Streams i.e.,filter()
		
		//converting collection into Stream object
		Stream<String> namesStream = names.stream();
		
		//Defining the implementation for Predicate Functional Interface to ensure name length is <=4 or not
		Predicate<String> nameLengthPredicate = (name) -> {
			//If name length is <=4 means will return true otherwise it will false.
			return name.length() <=4;
		};
		
		//Filtering the data using namesStream object whose namelength is <=4
		Stream<String> filteredData = namesStream.filter(nameLengthPredicate);
		
		//Defining the implementation for Consumer Functional Interface to display filteredData over the stream object
		Consumer<String> displayStringConsumer = (filteredName) -> {
		    System.out.println("Filtered Names :::::" + filteredName);
		};
		
		//Now Passing consumer object to forEach to display filtered Data over Stream
		filteredData.forEach(displayStringConsumer);
		
		System.out.println("******************************************************");
		//3. Refactoring the second technique into single line of code
		names.stream().filter(eachName -> {return eachName.length()<=4;})
					  .forEach(eachName -> System.out.println("Filtered names::::"+ eachName));		
		
	}

}
