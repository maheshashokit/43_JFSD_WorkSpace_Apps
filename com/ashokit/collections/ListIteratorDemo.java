package com.ashokit.collections;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		//creating Java9 style for creating immutable collection
		List<String> namesList = List.of("Satish","Rao","Ramesh","Abdul","Smith","Mark");
		
		//getting the ListIterator object
		ListIterator<String> namesListIterator = namesList.listIterator();
		
		//processing the elements towards forward direction
		System.out.println("1.Processing Elements using Forward direction...");
		while(namesListIterator.hasNext()) {
			String currentName = namesListIterator.next();
			System.out.println("Current Name:::::" + currentName);
		}
		System.out.println();
		System.out.println("2.Processing Elements using Backward direction...");
		while(namesListIterator.hasPrevious()) {
			String currentName = namesListIterator.previous();
			System.out.println("Current Name:::::" + currentName);
		}		
	}
}
