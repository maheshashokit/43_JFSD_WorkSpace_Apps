package com.ashokit.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {

		SortedSet<Integer> nosSet = new TreeSet<>();

		// adding the elements to nosSet
		nosSet.add(150);
		nosSet.add(343);
		nosSet.add(4354);
		nosSet.add(532);
		nosSet.add(22);
		nosSet.add(3242);
		nosSet.add(343);
		System.out.println("Numbers is Ascending Order::::::" + nosSet);

		SortedSet<String> namesSet = new TreeSet<>(Collections.reverseOrder());
		namesSet.add("Suresh");
		namesSet.add("Ramesh");
		namesSet.add("Nagesh");
		namesSet.add("Mahesh");
		namesSet.add("Naresh");
		namesSet.add("Ashok");
		namesSet.add("Ashok");
		namesSet.add("Ashok");
		namesSet.add("karthik");
		namesSet.add("karthik");
		namesSet.add("karthik");
		namesSet.add("Chanti");
		System.out.println("Names in Ascending Order::::::" + namesSet);
		
		String firstElement = namesSet.first();
		System.out.println("First Element:::::" + firstElement);
		
		String lastElement = namesSet.last();
		System.out.println("Last Element:::::" + lastElement);
		
		SortedSet<Integer> tailSetElements = nosSet.tailSet(343);  //Retrives subset which is greater than equal to 										     given element
		System.out.println("TailSet Elements:::::" + tailSetElements);
		
		SortedSet<Integer> headSetElements = nosSet.headSet(343); //Retrives subset which is lessthan to given 									                     element
		System.out.println("HeadSet Elements:::::" + headSetElements);
	}

}
