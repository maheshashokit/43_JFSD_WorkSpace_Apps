package com.ashokit.collections;

import java.util.HashMap;

public class HashCollisionSecondScenarioDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> info = new HashMap<>();
		info.put("FB","fb");
        info.put("Ea","ea");
        System.out.println(info);
       // System.out.println("Hash-1" +"FB".hashCode()); //2236
		// System.out.println("Hash-2" +"Ea".hashCode()); //2236
	}
}