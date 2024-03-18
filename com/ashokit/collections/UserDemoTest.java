package com.ashokit.collections;

public class UserDemoTest {
	
	public static void main(String[] args) {
		
		User user1  = new User("Mahesh","Test@123");
		System.out.println("user1 hashcode::::"+ user1.hashCode());
		User user2  = new User("Ashok","Test@123");
		System.out.println("user2 hashcode::::" + user2.hashCode());
		User user3 = user1;
		System.out.println("user3 hashcode:::::" + user3.hashCode());;
		//Object equals() method comparsion i.e.,reference comparsion
		if(user1.equals(user2)) {
			System.out.println("User1 & User2 Objects are equal...");
		}else if(user1.equals(user3)) {
		    System.out.println("User1 & User3 Objects are equal....");
		}
		if(!user1.equals(user2)){
			System.out.println("User1 & User2 Objects are not equal....");
		}
		
		//with out overriding we are getting different hashcodes i.e.,468121027,1804094807
		//We overriddent the equals() & hashcode() i.e.,
		User user4 = new User("Mahesh", "Test@123");
		User user5 = new User("Mahesh", "Test@123");
		System.out.println(user4.hashCode());
		System.out.println(user5.hashCode());
			
		
	}
}