package com.ashokit.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		Map<String,String> javaTrainers = new HashMap<>();
		//adding the data to map object
		javaTrainers.put("Mahesh","JFSD");
		javaTrainers.put("Ashok","SpringBoot");
		javaTrainers.put("Suresh","WebDevelopment");
		javaTrainers.put("Ramesh","PHP");
		System.out.println("JavaTrainers:::::" + javaTrainers);
		javaTrainers.putIfAbsent("Mahesh1", "Oracle");
		System.out.println("JavaTrainers:::::" + javaTrainers);
		
		Map<String,String> webTrainers = new HashMap<>();
		webTrainers.put("Ravi","HTML");
		webTrainers.put("Kumar","CSS");
		webTrainers.put("Sarath","JavaScript");
		System.out.println("WebTrainers :::::::" + webTrainers);
		
		Map<String,String> allTrainersInfo = new HashMap<>();
		allTrainersInfo.putAll(javaTrainers);
		allTrainersInfo.putAll(webTrainers);
		System.out.println(allTrainersInfo);
		
		//processing the map information using keySet(),entrySet()
		Set<String> keySet = allTrainersInfo.keySet();
		keySet.stream().forEach(eachKey  -> {
			//extracting value from map object based on key.
			String eachValue = allTrainersInfo.get(eachKey);
			System.out.println(eachKey + "=======" + eachValue);
		});
		
		Set<Entry<String, String>> entrySet = allTrainersInfo.entrySet();
		entrySet.stream().forEach(eachEntry -> {
			System.out.println(eachEntry.getKey() + " -----" + eachEntry.getValue());
		});
	}
}