package com.ashokit.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysExample {

	public static void main(String[] args) {
		// Sorting an array
		int[] numbers = { 5, 2, 8, 1, 9 };
		Arrays.sort(numbers);
		System.out.println("Sorted array: " + Arrays.toString(numbers));

		// Searching an element in a sorted array
		int key = 8;
		int index = Arrays.binarySearch(numbers, key);
		System.out.println("Index of " + key + " in the sorted array: " + index);

		// Converting an array to a String
		String[] fruits = { "Apple", "Banana", "Orange" };
		System.out.println("Array: " + Arrays.toString(fruits));

		// Convert the array to a fixed-size list
		List<String> fruitList = Arrays.asList(fruits);
		System.out.println("List: " + fruitList);

		// Convert the array to stream object
		Stream<String> fruitsStream = Arrays.stream(fruits);
		//fruitsStream.forEach(eachFruit -> System.out.println(eachFruit));

		// Checking equality of arrays
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.println("Arrays arr1 and arr2 are equal: " + isEqual);

		// Copying a range of elements from one array to another
		int[] sourceArray = { 1, 2, 3, 4, 5 };
		int[] destinationArray = Arrays.copyOfRange(sourceArray, 1, 4); // 2, 3, 4,
		System.out.println("Copied array: " + Arrays.toString(destinationArray));
		
		//We have fruitsStream to perform stream operations
		//Convert the each fruit name into uppercase and collect all fruit names into List
		//List<String> modifiedFruitsList = fruitsStream.map(eachFruit -> eachFruit.toUpperCase()).collect(Collectors.toList());
		//System.out.println(modifiedFruitsList);
		
		//we have fruitStream to perform stream operations
		//convert into map object (key -> fruitName, value -> length of fruitName)
		
		Function<String,String> keyMap = eachfruit -> {return eachfruit;};
		Function<String,Integer> valueMap = eachfruit -> {return eachfruit.length();};
		
		Map<String, Integer> fruitMap = fruitsStream.collect(Collectors.toMap(eachfruit -> {return eachfruit;}, 
																			  eachfruit -> {return eachfruit.length();}));
		System.out.println(fruitMap);
		
		//traditional approach
		List<String> namesList = Arrays.asList("Test","Testing","TestEngineer");
		//converting the List into Map object
		Map<String,Integer> namesMap = new HashMap<>();
		Iterator<String> namesIterator = namesList.iterator();
		while(namesIterator.hasNext()) {
			String currentElement = namesIterator.next();
			namesMap.put(currentElement, currentElement.length());
		}
		System.out.println(namesMap);
		
		//We have source of elements as List/Set i.e.,namesList
		//We want those values as comma seperated values i.e.,"Test","Testing","TestEngineer"
		
		//Traditional approach
		StringBuffer sb = new StringBuffer();
		Iterator<String> namesIterator1 = namesList.iterator();
		while(namesIterator1.hasNext()) {
			 String currentItem = namesIterator1.next();
			 sb.append(currentItem).append(",");
		}
		String names = sb.toString();
		System.out.println(names);
		String finalString = names.substring(0, names.lastIndexOf(","));
		System.out.println(finalString);
		
		//Java8 Streams
		String finalNameslist = namesList.stream().collect(Collectors.joining("||"));
		System.out.println("Java8 Stream ::::" + finalNameslist);
		
		long count = fruitList.stream().count();
		System.out.println("Elements Count From Stream object:::" + count);
		
		Optional<String> findFirst = fruitList.stream().findAny();
		//whether optional object is having data or not
		if(findFirst.isPresent()) {
			String firstElement = findFirst.get();
			System.out.println("First FruitName:::" + firstElement);
		}
		
		Optional<String> of = Optional.of("Mahesh");
		if(of.isPresent()) {
			System.out.println(of.get());
		}
	}
}
