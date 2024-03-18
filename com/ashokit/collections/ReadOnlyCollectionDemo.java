package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyCollectionDemo {
	
	public static void main(String[] args) {
		
		//Upto Java8 Version making collection as readonly
		//Not an Readonly collection
		List<String> names = new ArrayList<String>();
		names.add("Mahesh");
		names.add("Suresh");
		names.set(1, "Suresh Kumar");
		System.out.println("Names:::::" + names);
		
		//Making collection readonly 
		List<String> unmodifiableList = Collections.unmodifiableList(names);
		System.out.println("Unmodifiable List:::::" + unmodifiableList);
		
		//trying to add new name to names list i.e.,allowed operation
		names.add("Kumar");
		System.out.println("Final Names:::::" + names);
		
		//trying to add new name to unmodifiable List i.e.,not allowed operation
		//unmodifiableList.add("Naveen");
		System.out.println("Final Unmodifiable List:::::" + unmodifiableList);
		
		//Java9 version we can create immutable collection by using static method of()
		List<String> courses = List.of("CoreJava","AdvancedJava","Spring");
		System.out.println("All courses::::" + courses);
		courses.add("SpringBoot");
		
	}

}
