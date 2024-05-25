package com.ashokit.threads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterationDemo {
	
	public static void main(String[] args) {
		
		Map<String,String> courseMap = new HashMap<>();
		courseMap.put("CoreJava", "Mahesh");
		courseMap.put("AdvancedJava", "Ashok");
		courseMap.put("SpringBoot", "Mahesh");
		courseMap.put("AWS", "Ramesh");
		courseMap.put("Azure", "Phani");
		
		//Traditional approach
		Set<String> keySet = courseMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			//getting the current key
			String currentKey = iterator.next();
			String currentValue = courseMap.get(currentKey);
			System.out.println(currentKey+"=========="+ currentValue);
		}
		System.out.println("*****************************************");
	    //Traditional approach
		Set<Entry<String, String>> entrySet = courseMap.entrySet();
		Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			//getting the current entry
			Entry<String, String> currentEntry = iterator2.next();
			System.out.println(currentEntry.getKey()+"-----"+ currentEntry.getValue());
		}
		
		System.out.println("****************************************");
		courseMap.forEach((key,value) -> {
			System.out.println(key+"============"+ value);
		});
		System.out.println("****************************************");
		courseMap.entrySet().stream().forEach((eachEntry) ->{
			System.out.println(eachEntry.getKey()+"=====" + eachEntry.getValue());
		});
	}
}