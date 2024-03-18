package com.ashokit.collections;

import java.util.HashMap;

public class UserMapClient {
	public static void main(String[] args) {
		User user1 = new User("Mahesh", "Test@123");
		User user2 = new User("Mahesh", "Test@123");
		User user3 = user1;

		// HashMap Of User object
		HashMap<User, String> userMap = new HashMap<User, String>();
		HashMap<String, String> stringMap = new HashMap<String, String>();

		//user1--468121027   >>>>>>>>> BucketNo(8)  >>>>>>>>>>
		//user2--1804094807  >>>>>>>>> BucketNo(5)  >>>>>>>>>>
		// user1 & user2 objects contents are same but its get stored in different buckets in the HashMap hence it is
		// duplication in hashmap object
		userMap.put(user1, user1.getUsername());
		userMap.put(user2, user2.getUsername());

		//Mahesh >>>>>123  >>>>>>> BucketNo(4) >>>> hashcollision
		//Mahesh >>>>>123  >>>>>>> Bucket(4)   >>>> hashcollision
		//Whenever Hashcollision occurs string class equals() come into picture ensure incoming key & existing node key
		//if both are equal will perform update otherwise add new node to existing node.
		stringMap.put("Mahesh", "Test@123"); 
		stringMap.put("Mahesh", "Test@123");

		System.out.println("UserMap Size:::::" + userMap.size());//2
		System.out.println("StringMap Size:::::" + stringMap.size());//1
	}

}
