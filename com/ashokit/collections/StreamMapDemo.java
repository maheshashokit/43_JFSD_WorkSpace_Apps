package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapDemo {

	public static void main(String[] args) {

		List<String> numbers = List.of("100", "200", "300", "400", "500");

		List<Integer> finalNumbers = new ArrayList<>();

		// 1.Traditional Approach
		Iterator<String> numberIterator = numbers.iterator();
		while (numberIterator.hasNext()) {
			String currentNumber = numberIterator.next();
			Integer currentValue = Integer.valueOf(currentNumber);
			finalNumbers.add(currentValue);
		}
		System.out.println("Final Numbers:::::" + finalNumbers);

		System.out.println("*****************************************************");

		Stream<String> numberStream = numbers.stream();

		// Defining the logic for Function Functional 
		// Below Implementation will take input as String value and give them back as Integer value
		Function<String, Integer> functionObj = eachNumber -> {
			return Integer.valueOf(eachNumber);
		};

		// Defining the logic for Consumer Functional Interface
		Consumer<Integer> displayNumber = eachNumber -> {
			System.out.println("Each Number:::" + eachNumber);
			finalNumbers.add(eachNumber);
		};

		// Apply the map operation
		Stream<Integer> numbersAsStream = numberStream.map(functionObj); // ctrl+1

		// displaying the values
		numbersAsStream.forEach(displayNumber);
		
		System.out.println("*****************************************************");
		numbers.stream() //Stream<String>
		       .map(eachNumber  -> {return Integer.valueOf(eachNumber);})//Stream<Integer>
		       .forEach(number -> {System.out.println(number);});//displaying each Integer

	}

}
