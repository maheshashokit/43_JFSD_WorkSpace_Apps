package com.ashokit.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		 // Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add elements to the map
        linkedHashMap.put("apple", 10);
        linkedHashMap.put("banana", 5);
        linkedHashMap.put("cherry", 3);
        linkedHashMap.put("date", 8);
        // Print the map
        System.out.println("LinkedHashMap: " + linkedHashMap);
        // Accessing elements
        int quantity = linkedHashMap.get("banana");
        System.out.println("Quantity of bananas: " + quantity);
        // Modifying an existing element
        linkedHashMap.put("cherry", 4);
        System.out.println("Modified LinkedHashMap: " + linkedHashMap);
        // Removing an element
        linkedHashMap.remove("apple");
        System.out.println("LinkedHashMap after removing 'apple': " + linkedHashMap);
        
        // Iterating over the entries
        System.out.println("Iterating over entries:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        
        // Checking if the map contains a key
        boolean containsKey = linkedHashMap.containsKey("date");
        System.out.println("Contains key 'date'? " + containsKey);
        
        // Checking if the map contains a value
        boolean containsValue = linkedHashMap.containsValue(6);
        System.out.println("Contains value 6? " + containsValue);
        
         // Clearing the map
        linkedHashMap.clear();
        System.out.println("LinkedHashMap after clearing: " + linkedHashMap);
	}
}
