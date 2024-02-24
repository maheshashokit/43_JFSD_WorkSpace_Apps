package com.ashokit.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//Creating the Arraylist Object i.e.,Not TypeSafe Collection
		ArrayList al = new ArrayList();
		System.out.println("ArrayList Size:::::"+ al.size());
		al.add("Mahesh");
		al.add("Mahesh");
		al.add(12);
		al.add(12);
		al.add(12.365f);
		al.add(12.3698d);
		al.add(12.3698d);
		al.add(true);
		al.add(true);
		al.add('c');
		System.out.println("ArrayList Raw Data:::::" + al);
		System.out.println("ArrayList Raw Data:::::" + al.size());
		al.add(6,25);
		System.out.println("After Adding Element at particular index:::::" + al);
		al.set(6, 50);
		System.out.println("After Updating List ::::" + al);
		System.out.println("Getting Element based on Index:::" + al.get(6));
		System.out.println("Elements Contains or not ::::" + al.contains("ashok"));//false
		System.out.println("Elements Contains or not ::::" + al.contains(50));// true
		ArrayList<Comparable> al2 = (ArrayList)al.clone();
		System.out.println("Cloned ArrayList::::" + al2);
		System.out.println("Existing ArrayList:::::" + al);
		//clearing the elements from Arraylist
		al.clear();
		System.out.println("After Clearing Cloned ArrayList::::" + al2);
		System.out.println("After Clearing Existing ArrayList:::::" + al);
		Object remove = al2.remove(6);
		System.out.println("Element Removed :::::" + remove);
		boolean add = al2.add(150);
		boolean add1 = al2.add("Ashok");
		System.out.println("Element Added :::::" + add);
		boolean remove2 = al2.remove("Ashok");
		System.out.println("Element Removed::::" + remove2);
		
		
		
		//Type Safe Collection
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(101);
		al1.add(100);
		al1.add(1000);
		al1.add(100000);
		System.out.println("ArrayList Integer Data::::" + al1);
	}

}
