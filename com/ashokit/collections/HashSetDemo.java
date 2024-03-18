package com.ashokit.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
		// Creating Object HashSet Object
		HashSet<Integer> numberSet1 = new HashSet<Integer>();
		HashSet<Integer> numberSet2 = new HashSet<Integer>();

		// Adding the elements to Set object
		for (int i = 1; i <= 15; i++) {
			numberSet1.add(i);
		}
		for (int i = 1; i <= 5; i++) {
			numberSet2.add(i);
		}
		// trying to add duplicate values and it will not add it
		numberSet1.add(12);
		numberSet1.add(13);
		numberSet1.add(14);

		System.out.println("Data From Set Object-1::::" + numberSet1);
		System.out.println("Size of Set Object  ::::" + numberSet1.size());
		System.out.println("Data From Set Object-2::::" + numberSet2);
		System.out.println("Size of Set Object  ::::" + numberSet2.size());
		
		boolean retainFlag = numberSet1.retainAll(numberSet2);
		if(retainFlag) {
			System.out.println(numberSet1);
			System.out.println(numberSet2);
		}
		
		//Creating the ArrayList
		List<Integer> nosList = new ArrayList<>();
		nosList.add(125);
		nosList.add(125);
		nosList.add(150);
		nosList.add(175);
		
		//Adding the List object to Set Object
		numberSet1.addAll(nosList);
		System.out.println("numberList-1:::::" + numberSet1);
		
		//checking one set elements to another set
		boolean containsFlag = numberSet1.containsAll(numberSet2);
		System.out.println("Contains Flag::::" + containsFlag);
	}

}
